package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import defpackage.j71;
import defpackage.m63;
import defpackage.zsf;
import defpackage.zy1;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class CctBackendFactory implements j71 {
    @Override // defpackage.j71
    public zsf create(m63 m63Var) {
        return new zy1(m63Var.a(), m63Var.d(), m63Var.c());
    }
}
