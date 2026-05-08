package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import app.rive.runtime.kotlin.renderers.RendererMetrics;
import com.datadog.android.core.internal.net.info.BroadcastReceiverNetworkInfoProvider;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import defpackage.u63;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzil {
    private final zzim zza;

    public zzil(zzim zzimVar) {
        this.zza = zzimVar;
    }

    private static final void zzb(zzakm zzakmVar) {
        for (zzakj zzakjVar : zzakmVar.zze()) {
            String str = "INIT_TOTAL";
            List listA0 = u63.a0("INIT_TOTAL", "EXECUTE_TOTAL");
            switch (zzakjVar.zzae()) {
                case 2:
                    str = "UNKNOWN";
                    break;
                case 3:
                    str = "INIT_NATIVE";
                    break;
                case 4:
                    str = "INIT_NETWORK";
                    break;
                case 5:
                    str = "INIT_JS";
                    break;
                case 6:
                    break;
                case 7:
                    str = "EXECUTE_NATIVE";
                    break;
                case 8:
                    str = "EXECUTE_JS";
                    break;
                case DatadogLogGenerator.CRASH /* 9 */:
                    str = "EXECUTE_TOTAL";
                    break;
                case 10:
                    str = "CHALLENGE_ACCOUNT_NATIVE";
                    break;
                case 11:
                    str = "CHALLENGE_ACCOUNT_JS";
                    break;
                case 12:
                    str = "CHALLENGE_ACCOUNT_TOTAL";
                    break;
                case 13:
                    str = "VERIFY_PIN_NATIVE";
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 14 */:
                    str = "VERIFY_PIN_JS";
                    break;
                case 15:
                    str = "VERIFY_PIN_TOTAL";
                    break;
                case 16:
                    str = "RUN_PROGRAM";
                    break;
                case 17:
                    str = "FETCH_ALLOWLIST";
                    break;
                case 18:
                    str = "JS_LOAD";
                    break;
                case BroadcastReceiverNetworkInfoProvider.NETWORK_TYPE_LTE_CA /* 19 */:
                    str = "WEB_VIEW_RELOAD_JS";
                    break;
                case 20:
                    str = "INIT_NETWORK_MRI_ACTION";
                    break;
                case 21:
                    str = "INIT_DOWNLOAD_JS";
                    break;
                case 22:
                    str = "VALIDATE_INPUT";
                    break;
                case 23:
                    str = "DOWNLOAD_JS";
                    break;
                case 24:
                    str = "SAVE_CACHE_JS";
                    break;
                case 25:
                    str = "LOAD_CACHE_JS";
                    break;
                case 26:
                    str = "LOAD_WEBVIEW";
                    break;
                case 27:
                    str = "COLLECT_SIGNALS";
                    break;
                case 28:
                    str = "FETCH_TOKEN";
                    break;
                case 29:
                    str = "POST_EXECUTE";
                    break;
                case RendererMetrics.SAMPLES /* 30 */:
                    str = "SIGNAL_MANAGER_INITIALIZATION";
                    break;
                case 31:
                    str = "SIGNAL_MANAGER_COLLECT_SIGNALS";
                    break;
                case 32:
                    str = "WEBVIEW_ENGINE_INITIALIATION";
                    break;
                case 33:
                    str = "WEBVIEW_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 34:
                    str = "NATIVE_ENGINE_INITIALIZATION";
                    break;
                case 35:
                    str = "NATIVE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 36:
                    str = "NATIVE_SIGNAL_INITIALIZATION";
                    break;
                case 37:
                    str = "NATIVE_SIGNAL_COLLECTION";
                    break;
                case 38:
                    str = "PIA_WARMUP";
                    break;
                case 39:
                    str = "GMSCORE_ENGINE_INITIALIZATION";
                    break;
                case 40:
                    str = "GMSCORE_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 41:
                    str = "INIT_ATTEMPT";
                    break;
                case 42:
                    str = "WEBVIEW_INITIALIZATION";
                    break;
                case 43:
                    str = "ORCAS_ENGINE_INITIALIZATION";
                    break;
                case 44:
                    str = "ORCAS_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 45:
                    str = "INIT_CLIENT_REUSE";
                    break;
                case 46:
                    str = "ORCAS_SIGNAL_COLLECTION";
                    break;
                case 47:
                    str = "ORCAS_SIGNAL_INITIALIZATION";
                    break;
                case 48:
                    str = "FETCH_TOKEN_ATTEMPT";
                    break;
                case 49:
                    str = "ORCAS_FETCH_VERIFICATION_KEY";
                    break;
                case 50:
                    str = "ORCAS_VALIDATE_SIGNATURE";
                    break;
                case 51:
                    str = "ORCAS_ENGINE_POST_WARMUP_SIGNAL_COLLECTION";
                    break;
                case 52:
                    str = "DROIDGUARD_ENGINE_INITIALIZATION";
                    break;
                case 53:
                    str = "DROIDGUARD_ENGINE_SIGNAL_COLLECTION";
                    break;
                case 54:
                    str = "ORCAS_FETCH_VERIFICATION_KEY_ATTEMPT";
                    break;
                default:
                    str = "UNRECOGNIZED";
                    break;
            }
            if (listA0.contains(str) && zzakjVar.zzu()) {
                zzakjVar.zzi();
                zzakjVar.zzj();
                zzakjVar.zzae();
                zzakjVar.zzc().zze();
                zzakjVar.zzc().zza();
                zzakjVar.zzaf();
            } else {
                zzakjVar.zzi();
                zzakjVar.zzj();
                zzakjVar.zzae();
                zzakjVar.zzaf();
            }
        }
    }

    public final boolean zza(zzakm zzakmVar) {
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(zzakmVar);
            return this.zza.zza(zzakmVar);
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }
}
