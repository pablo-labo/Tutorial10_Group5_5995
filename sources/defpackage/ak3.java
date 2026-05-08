package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class ak3 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = vjg.a;
        Locale locale = Locale.US;
        StringBuilder sbF = uz.f("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        uz.i(sbF, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        uz.i(sbF, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        uz.i(sbF, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        uz.i(sbF, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbF.append(j);
        sbF.append("\n videoFrameProcessingOffsetCount=");
        sbF.append(i11);
        sbF.append("\n}");
        return sbF.toString();
    }
}
