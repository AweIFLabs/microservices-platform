package com.central.oauth2.common.pojo;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author zlt
 * @version 1.0
 * @date 2023/12/2
 * <p>
 * Blog: http://zlt2000.gitee.io
 * Github: https://github.com/zlt2000
 */
@Data
public class ClientDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String clientId;
    /**
     * 应用名称
     */
    private String clientName;
    private String resourceIds = "";
    private String clientSecret;
    private String clientSecretStr;
    private String scope = "all";
    private String authorizedGrantTypes = "authorization_code,password,refresh_token,client_credentials";
    private String webServerRedirectUri;
    private String authorities = "";

    private Integer accessTokenValiditySeconds = 18000;

    private Integer refreshTokenValiditySeconds = 28800;
    private String additionalInformation = "{}";
    private String autoapprove = "true";
    /**
     * 是否支持id_token
     */
    private Boolean supportIdToken = true;
    /**
     * id_token有效时间(s)
     */
    private Integer idTokenValiditySeconds = 60;

    private Long creatorId;
}
