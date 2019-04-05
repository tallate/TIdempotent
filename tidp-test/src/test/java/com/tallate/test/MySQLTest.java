package com.tallate.test;

import com.tallate.tidp.IdpKey;
import com.tallate.tidp.KeyState;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;
import javax.annotation.Resource;
import javax.sql.DataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jca.cci.connection.ConnectionFactoryUtils;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 尝试使用JDBC调用MySQL服务
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestMySQLIdpApplication.class, webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class MySQLTest {

  @Resource
  private DataSource dataSource;

  @Test
  public void testSave() {
    String sql = "insert into idpkey(id, key_state, content) values(?, ?, ?)";
    IdpKey idpKey = new IdpKey()
        .setId(UUID.randomUUID().toString())
        .setKeyState(KeyState.SUCCESS)
        .setContent("Hello".getBytes());
    try(Connection conn = dataSource.getConnection()) {
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, idpKey.getId());
      pstmt.setString(2, idpKey.getKeyState().name());
      pstmt.setBytes(3, idpKey.getContent());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
