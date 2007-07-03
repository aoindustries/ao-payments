package com.aoindustries.creditcards;

/*
 * Copyright 2007 by AO Industries, Inc.,
 * 816 Azalea Rd, Mobile, Alabama, 36693, U.S.A.
 * All rights reserved.
 */
import java.io.IOException;
import java.util.Locale;

/**
 * Extends <code>IOException</code> to provide exceptions with both JVM default locale and user locale error messages.
 *
 * @author  AO Industries, Inc.
 */
public class LocalizedIOException extends IOException {

    final private String localizedMessage;

    public LocalizedIOException(Locale userLocale, String key) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key));
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key);
    }

    public LocalizedIOException(Locale userLocale, String key, Object arg0) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key, arg0));
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key, arg0);
    }

    public LocalizedIOException(Locale userLocale, String key, Object arg0, Object arg1) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key, arg0, arg1));
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key, arg0, arg1);
    }

    public LocalizedIOException(Throwable cause, Locale userLocale, String key) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key));
        initCause(cause);
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key);
    }

    public LocalizedIOException(Throwable cause, Locale userLocale, String key, Object arg0) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key, arg0));
        initCause(cause);
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key, arg0);
    }

    public LocalizedIOException(Throwable cause, Locale userLocale, String key, Object arg0, Object arg1) {
        super(ApplicationResourcesAccessor.getMessage(Locale.getDefault(), key, arg0, arg1));
        initCause(cause);
        this.localizedMessage = ApplicationResourcesAccessor.getMessage(userLocale, key, arg0, arg1);
    }

    public String getLocalizedMessage() {
        return localizedMessage;
    }
}
