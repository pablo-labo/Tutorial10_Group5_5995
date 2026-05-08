package com.datadog.android.core.configuration;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.utils.RuntimeUtilsKt;
import com.datadog.android.lint.InternalApi;
import defpackage.gu5;
import defpackage.pxc;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/datadog/android/core/configuration/HostsSanitizer;", "", "()V", "sanitizeHosts", "", "", "hosts", "feature", "Companion", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class HostsSanitizer {
    public static final String ERROR_MALFORMED_HOST_IP_ADDRESS = "You are using a malformed host or ip address \"%s\" to setup %s tracking. It will be dropped.";
    public static final String ERROR_MALFORMED_URL = "You are using a malformed url \"%s\" to setup %s tracking. It will be dropped. Please try using a host name instead, e.g.: \"example.com\"";
    private static final String URL_REGEX = "^(http|https)://(.*)";
    private static final String VALID_DOMAIN_REGEX = "^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)+([A-Za-z]|[A-Za-z][A-Za-z0-9-]*[A-Za-z0-9])$";
    private static final String VALID_HOSTNAME_REGEX = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$|^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)+([A-Za-z]|[A-Za-z][A-Za-z0-9-]*[A-Za-z0-9])$";
    private static final String VALID_IP_REGEX = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
    public static final String WARNING_USING_URL = "You are using a url \"%s\" instead of a host to setup %s tracking. You should use instead a valid host name: \"%s\"";

    @InternalApi
    public final List<String> sanitizeHosts(List<String> hosts, String feature) {
        hosts.getClass();
        feature.getClass();
        pxc pxcVar = new pxc(VALID_HOSTNAME_REGEX);
        pxc pxcVar2 = new pxc(URL_REGEX);
        ArrayList arrayList = new ArrayList();
        for (String host : hosts) {
            if (pxcVar2.d(host)) {
                try {
                    URL url = new URL(host);
                    InternalLogger.DefaultImpls.log$default(RuntimeUtilsKt.getUnboundInternalLogger(), InternalLogger.Level.WARN, InternalLogger.Target.USER, (gu5) new HostsSanitizer$sanitizeHosts$1$1(host, feature, url), (Throwable) null, false, (Map) null, 56, (Object) null);
                    host = url.getHost();
                } catch (MalformedURLException e) {
                    InternalLogger.DefaultImpls.log$default(RuntimeUtilsKt.getUnboundInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new HostsSanitizer$sanitizeHosts$1$2(host, feature), (Throwable) e, false, (Map) null, 48, (Object) null);
                    host = null;
                }
            } else if (!pxcVar.d(host)) {
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = host.toLowerCase(locale);
                lowerCase.getClass();
                if (!lowerCase.equals("localhost")) {
                    InternalLogger.DefaultImpls.log$default(RuntimeUtilsKt.getUnboundInternalLogger(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, (gu5) new HostsSanitizer$sanitizeHosts$1$3(host, feature), (Throwable) null, false, (Map) null, 56, (Object) null);
                    host = null;
                }
            }
            if (host != null) {
                arrayList.add(host);
            }
        }
        return arrayList;
    }
}
