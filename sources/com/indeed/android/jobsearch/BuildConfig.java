package com.indeed.android.jobsearch;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class BuildConfig {
    public static final String BUILD_COMMIT_HASH = "d0488e7d";
    public static final String BUILD_TYPE = "release";
    public static final String FLAVOR = "playProd";
    public static final int VERSION_CODE = 99968;
    public static final String VERSION_NAME = "277.1";

    static {
        new HashSet(Arrays.asList("profile-api-prod.s3.us-west-2.amazonaws.com", "profile-file-service-temp-prod.s3.us-west-2.amazonaws.com"));
    }
}
