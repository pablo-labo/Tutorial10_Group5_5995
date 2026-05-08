package com.google.android.recaptcha.internal;

import android.app.Application;
import java.util.Locale;
import java.util.MissingResourceException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhz {
    private final Application zza;
    private zzajq zzb;

    public zzhz(Application application, zzeh zzehVar) {
        this.zza = application;
    }

    private static final String zzb() {
        try {
            String iSO3Country = Locale.getDefault().getISO3Country();
            iSO3Country.getClass();
            return iSO3Country;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    private static final String zzc() {
        try {
            String iSO3Language = Locale.getDefault().getISO3Language();
            iSO3Language.getClass();
            return iSO3Language;
        } catch (MissingResourceException unused) {
            return "";
        }
    }

    /* JADX WARN: Path cross not found for [B:6:0x001c, B:10:0x003d], limit reached: 33 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: NameNotFoundException -> 0x00b9, TRY_LEAVE, TryCatch #0 {NameNotFoundException -> 0x00b9, blocks: (B:15:0x006a, B:17:0x006e, B:21:0x0092, B:22:0x00a7), top: B:29:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:27:0x0036
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.recaptcha.internal.zzakv zza(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzhz.zza(java.lang.String):com.google.android.recaptcha.internal.zzakv");
    }
}
