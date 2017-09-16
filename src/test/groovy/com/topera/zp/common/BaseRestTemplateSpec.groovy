package com.topera.zp.common

import org.mockito.Mock
import org.springframework.web.client.RestTemplate

import static org.mockito.Mockito.when

abstract class BaseRestTemplateSpec extends BaseUnitSpec {

    @Mock
    RestTemplate restTemplate

    protected void mockRestTemplate(String url, Class clazz, Object result) {
        when(restTemplate.getForObject(url, clazz)).thenReturn(result)
    }

}
