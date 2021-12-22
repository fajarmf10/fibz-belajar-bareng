package com.btpn.bes;

import com.btpn.auth.annotation.EnableCustomPublisherAuthentication;
import com.btpn.auth.annotation.EnableUserAuditEntity;
import com.btpn.bes.response.annotation.EnableCommonResponse;
import com.btpn.logging.annotation.EnableLogging;
import com.btpn.runningnumber.annotation.EnableMsSQLSequenceNumber;
import com.btpn.wscall.annotation.EnableCommonParamGenerator;
import com.btpn.wscall.annotation.EnableRestWSCall;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableLogging
@EntityScan({"com.btpn.persistence", "com.btpn.bes.persistence"})
@EnableJpaRepositories({"com.btpn.persistence", "com.btpn.bes.persistence"})
@EnableCommonResponse
@EnableCustomPublisherAuthentication
@EnableUserAuditEntity
@EnableCommonParamGenerator
@EnableRestWSCall
@EnableWebMvc
@EnableCaching
@EnableMsSQLSequenceNumber
public class BesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BesApplication.class, args);
    }

}
