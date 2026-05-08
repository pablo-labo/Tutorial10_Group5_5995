package com.wlappdebug;

import androidx.compose.ui.e;
import com.wlappdebug.DebugFlagsActivity;
import defpackage.ah2;
import defpackage.ake;
import defpackage.c20;
import defpackage.gl2;
import defpackage.hm8;
import defpackage.j6g;
import defpackage.mb2;
import defpackage.mj8;
import defpackage.ob2;
import defpackage.pg8;
import defpackage.pm8;
import defpackage.t8b;
import defpackage.uz;
import defpackage.vs0;
import defpackage.wl7;
import defpackage.ygg;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
    final /* synthetic */ DebugFlagsActivity.a $editor;
    final /* synthetic */ List<String> $tokens;
    final /* synthetic */ DebugFlagsActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(DebugFlagsActivity debugFlagsActivity, DebugFlagsActivity.a aVar, List<String> list) {
        super(2);
        this.this$0 = debugFlagsActivity;
        this.$editor = aVar;
        this.$tokens = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
        androidx.compose.runtime.b bVar2 = bVar;
        if ((num.intValue() & 11) == 2 && bVar2.i()) {
            bVar2.D();
            return j6g.a;
        }
        DebugFlagsActivity debugFlagsActivity = this.this$0;
        DebugFlagsActivity.a aVar = this.$editor;
        List<String> list = this.$tokens;
        bVar2.u(-483455358);
        ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
        bVar2.u(-1323940314);
        int iG = bVar2.G();
        t8b t8bVarM = bVar2.m();
        gl2.j.getClass();
        pm8.a aVar2 = gl2.a.b;
        ah2 ah2VarA = hm8.a(e.a.b);
        if (bVar2.j() == null) {
            pg8.B();
            throw null;
        }
        bVar2.B();
        if (bVar2.f()) {
            bVar2.y(aVar2);
        } else {
            bVar2.n();
        }
        ygg.y(bVar2, ob2VarA, gl2.a.g);
        ygg.y(bVar2, t8bVarM, gl2.a.f);
        gl2.a.C0251a c0251a = gl2.a.j;
        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
            uz.g(iG, bVar2, iG, c0251a);
        }
        ah2VarA.q(new ake(bVar2), bVar2, 0);
        bVar2.u(2058660585);
        DebugFlagsActivity.B(debugFlagsActivity, aVar, list, bVar2, 584);
        throw null;
    }
}
