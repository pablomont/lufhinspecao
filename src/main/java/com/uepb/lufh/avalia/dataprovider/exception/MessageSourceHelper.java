package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;


public class MessageSourceHelper {

    private static MessageSourceHelper instance;
    private final MessageSource messageSource;

    private MessageSourceHelper() {
        messageSource = new ResourceBundleMessageSource();
        ((ResourceBundleMessageSource) messageSource).setBasename("messages_en");
        ((ResourceBundleMessageSource) messageSource).setDefaultEncoding("UTF-8");
    }

    public static synchronized MessageSourceHelper getInstance() {

        if (instance == null) {
            instance = new MessageSourceHelper();
        }
        return instance;
    }

    public String getMessage(final String code, Object... args) {
        return messageSource.getMessage(code,  args , Locale.getDefault());
    }

}
