package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzadp;
import com.google.android.recaptcha.internal.zzadq;
import defpackage.l5;
import defpackage.l6;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzadq<MessageType extends zzadq<MessageType, BuilderType>, BuilderType extends zzadp<MessageType, BuilderType>> implements zzahl {
    protected int zzb = 0;

    public static void zzx(Iterable iterable, List list) {
        zzadp.zzl(iterable, list);
    }

    public int zzv(zzahz zzahzVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzahl
    public final zzaef zzw() {
        try {
            int iZzA = zzA();
            zzaef zzaefVar = zzaef.zzb;
            byte[] bArr = new byte[iZzA];
            int i = zzaeo.zzb;
            zzael zzaelVar = new zzael(bArr, 0, iZzA);
            zzaa(zzaelVar);
            zzaelVar.zzz();
            return new zzaed(bArr);
        } catch (IOException e) {
            l6.p(l5.m("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public final byte[] zzy() {
        try {
            int iZzA = zzA();
            byte[] bArr = new byte[iZzA];
            int i = zzaeo.zzb;
            zzael zzaelVar = new zzael(bArr, 0, iZzA);
            zzaa(zzaelVar);
            zzaelVar.zzz();
            return bArr;
        } catch (IOException e) {
            l6.p(l5.m("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }
}
