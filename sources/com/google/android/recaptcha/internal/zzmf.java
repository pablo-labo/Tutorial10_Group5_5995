package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.b0;
import defpackage.lc9;
import java.util.Map;
import kotlin.Pair;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmf implements zzme {
    private final Context zza;
    private final Map zzb = lc9.a0(new Pair(2, "activity"), new Pair(3, "phone"), new Pair(4, "input_method"), new Pair(5, MediaStreamTrack.AUDIO_TRACK_KIND));

    public zzmf(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzme
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzmd.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzme
    public final Object zza(Object... objArr) throws zzeu {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            b0.n(4, 5, null);
            return null;
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzeu(4, 4, null);
    }
}
