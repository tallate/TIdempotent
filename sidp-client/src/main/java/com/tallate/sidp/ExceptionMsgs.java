package com.tallate.sidp;

/**
 * @author tallate
 * @date 1/20/19
 */
public class ExceptionMsgs {

  public static final String IDPKEY_STORE_EXCEPTION = "[幂等性组件错误]：IdpKey持久化失败";

  public static final String IDPKEY_KEYSTORE_SAVE_EXCEPTION = "[幂等性组件错误]：IdpKey保存失败";

  public static final String IDPKEY_KEYSTORE_QUERY_EXCEPTION = "[幂等性组件错误]：IdpKey查询失败";

  public static final String IDPKEY_KEYSTORE_DELETE_EXCEPTION = "[幂等性组件错误]：IdpKey删除失败";

  public static final String IDPKEY_KEYSTORE_CLEANUP_EXCEPTION = "[幂等性组件错误]：IdpKey清理出错";

  public static final String IDPKEY_KEYSTORE_SERIALIZING_EXCEPTION = "[幂等性组件错误]：IdpKey序列化出错";

  public static final String IDPKEY_GEN_EXCEPTION = "[幂等性组件错误]：IdpKey生成失败";

  public static final String IDP_BLOCKINGCHECK_EXCEPTION = "[幂等性组件错误]：阻塞检查时被意外中断";

  public static final String IDP_REJECT_EXCEPTION = "[幂等性拦截]：IdpKey被重复调用";

  public static final String IDP_RETRYLIMIT_EXCEPTION = "[幂等性拦截]：阻塞重试次数达阈值";
}
