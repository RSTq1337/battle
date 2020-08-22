package com.mog.rstq.norriv.summerProject.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Data
@NoArgsConstructor
@Configuration
public class CloudinaryConfig {

    private String cloudName;
    private String apiKey;
    private String apiSecret;

    public Cloudinary configCloud(){
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", cloudName,
                "api_key", apiKey,
                "api_secret", apiSecret));
    }

}
