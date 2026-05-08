package com.facebook.react.soloader;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0007\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u000b\u0010\u0004J\u0010\u0010\f\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\r\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0011\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0013\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u0002H\u0086 ¢\u0006\u0004\b\u0015\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/soloader/OpenSourceMergedSoMapping;", "", "", "libfabricjni_so", "()I", "libhermes_executor_so", "libhermesinstancejni_so", "libhermestooling_so", "libjsijniprofiler_so", "libjsinspector_so", "libmapbufferjni_so", "libreact_devsupportjni_so", "libreact_featureflagsjni_so", "libreact_newarchdefaults_so", "libreactnative_so", "libreactnativeblob_so", "libreactnativejni_so", "libreactnativejni_common_so", "librninstance_so", "libturbomodulejsijni_so", "libuimanagerjni_so", "libyoga_so", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OpenSourceMergedSoMapping {
    public static final OpenSourceMergedSoMapping a = new OpenSourceMergedSoMapping();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1793638007:
                if (str.equals("mapbufferjni")) {
                    libmapbufferjni_so();
                    break;
                }
                break;
            case -1624070447:
                if (str.equals("rninstance")) {
                    librninstance_so();
                    break;
                }
                break;
            case -1570429553:
                if (str.equals("reactnativejni")) {
                    libreactnativejni_so();
                    break;
                }
                break;
            case -1438915853:
                if (str.equals("reactnativeblob")) {
                    libreactnativeblob_so();
                    break;
                }
                break;
            case -1382694412:
                if (str.equals("react_featureflagsjni")) {
                    libreact_featureflagsjni_so();
                    break;
                }
                break;
            case -1259441509:
                if (str.equals("reactnativejni_common")) {
                    libreactnativejni_common_so();
                    break;
                }
                break;
            case -1033318826:
                if (str.equals("reactnative")) {
                    libreactnative_so();
                    break;
                }
                break;
            case -579037304:
                if (str.equals("react_newarchdefaults")) {
                    libreact_newarchdefaults_so();
                    break;
                }
                break;
            case -49345041:
                if (str.equals("turbomodulejsijni")) {
                    libturbomodulejsijni_so();
                    break;
                }
                break;
            case 3714672:
                if (str.equals("yoga")) {
                    libyoga_so();
                    break;
                }
                break;
            case 65536138:
                if (str.equals("hermesinstancejni")) {
                    libhermesinstancejni_so();
                    break;
                }
                break;
            case 86183502:
                if (str.equals("jsijniprofiler")) {
                    libjsijniprofiler_so();
                    break;
                }
                break;
            case 352552524:
                if (str.equals("hermes_executor")) {
                    libhermes_executor_so();
                    break;
                }
                break;
            case 614482404:
                if (str.equals("hermestooling")) {
                    libhermestooling_so();
                    break;
                }
                break;
            case 688235659:
                if (str.equals("react_devsupportjni")) {
                    libreact_devsupportjni_so();
                    break;
                }
                break;
            case 716617324:
                if (str.equals("uimanagerjni")) {
                    libuimanagerjni_so();
                    break;
                }
                break;
            case 1590431694:
                if (str.equals("jsinspector")) {
                    libjsinspector_so();
                    break;
                }
                break;
            case 2016911584:
                if (str.equals("fabricjni")) {
                    libfabricjni_so();
                    break;
                }
                break;
        }
    }

    public final native int libfabricjni_so();

    public final native int libhermes_executor_so();

    public final native int libhermesinstancejni_so();

    public final native int libhermestooling_so();

    public final native int libjsijniprofiler_so();

    public final native int libjsinspector_so();

    public final native int libmapbufferjni_so();

    public final native int libreact_devsupportjni_so();

    public final native int libreact_featureflagsjni_so();

    public final native int libreact_newarchdefaults_so();

    public final native int libreactnative_so();

    public final native int libreactnativeblob_so();

    public final native int libreactnativejni_common_so();

    public final native int libreactnativejni_so();

    public final native int librninstance_so();

    public final native int libturbomodulejsijni_so();

    public final native int libuimanagerjni_so();

    public final native int libyoga_so();
}
