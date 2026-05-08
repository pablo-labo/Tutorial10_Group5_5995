package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0149a interfaceC0149a) {
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iB = interfaceC0149a.b(context, str);
        bVar.a = iB;
        if (iB != 0) {
            bVar.c = -1;
            return bVar;
        }
        int iA = interfaceC0149a.a(context, str, true);
        bVar.b = iA;
        if (iA != 0) {
            bVar.c = 1;
        }
        return bVar;
    }
}
