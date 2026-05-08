package com.facebook.imagepipeline.nativecode;

import defpackage.h84;
import defpackage.jo3;
import defpackage.l37;
import defpackage.m37;
import defpackage.s9a;
import defpackage.z07;

/* JADX INFO: loaded from: classes2.dex */
@h84
public class NativeJpegTranscoderFactory implements m37 {
    public final int a;
    public final boolean b;
    public final boolean c;

    @h84
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.m37
    @h84
    public l37 createImageTranscoder(z07 z07Var, boolean z) {
        if (z07Var != jo3.a) {
            return null;
        }
        NativeJpegTranscoder nativeJpegTranscoder = new NativeJpegTranscoder();
        nativeJpegTranscoder.a = z;
        nativeJpegTranscoder.b = this.a;
        nativeJpegTranscoder.c = this.b;
        if (this.c) {
            s9a.a();
        }
        return nativeJpegTranscoder;
    }
}
