package defpackage;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qg9 implements Comparator {
    public final /* synthetic */ MediaCodecUtil.c a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        MediaCodecUtil.c cVar = this.a;
        return cVar.d(obj2) - cVar.d(obj);
    }
}
