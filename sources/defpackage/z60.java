package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import defpackage.gl2;
import defpackage.pm8;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class z60 {

    @uh3(c = "androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1", f = "AndroidDialog.android.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ p44 $dialog;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p44 p44Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$dialog = p44Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$dialog, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$dialog.show();
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function1<m74, l74> {
        final /* synthetic */ p44 $dialog;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p44 p44Var) {
            super(1);
            this.$dialog = p44Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final l74 invoke(m74 m74Var) {
            return new a70(this.$dialog);
        }
    }

    public static final class c extends mj8 implements gu5<j6g> {
        final /* synthetic */ p44 $dialog;
        final /* synthetic */ vl8 $layoutDirection;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ o44 $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(p44 p44Var, gu5<j6g> gu5Var, o44 o44Var, vl8 vl8Var) {
            super(0);
            this.$dialog = p44Var;
            this.$onDismissRequest = gu5Var;
            this.$properties = o44Var;
            this.$layoutDirection = vl8Var;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            this.$dialog.e(this.$onDismissRequest, this.$properties, this.$layoutDirection);
            return j6g.a;
        }
    }

    public static final class d extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ o44 $properties;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(gu5<j6g> gu5Var, o44 o44Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, int i, int i2) {
            super(2);
            this.$onDismissRequest = gu5Var;
            this.$properties = o44Var;
            this.$content = function2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            z60.a(this.$onDismissRequest, this.$properties, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ ese<Function2<androidx.compose.runtime.b, Integer, j6g>> $currentContent$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g4a g4aVar) {
            super(2);
            this.$currentContent$delegate = g4aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                Object objV = bVar2.v();
                if (objV == b.a.a) {
                    objV = b70.a;
                    bVar2.p(objV);
                }
                z60.b(b5e.b(e.a.b, false, (Function1) objV), this.$currentContent$delegate.getValue(), bVar2, 0, 0);
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements gu5<UUID> {
        public static final f a = new f(0);

        @Override // defpackage.gu5
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.gu5<defpackage.j6g> r17, defpackage.o44 r18, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r19, androidx.compose.runtime.b r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z60.a(gu5, o44, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(androidx.compose.ui.e eVar, Function2 function2, androidx.compose.runtime.b bVar, int i, int i2) {
        int i3;
        androidx.compose.runtime.c cVarH = bVar.h(1090521195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= cVarH.x(function2) ? 32 : 16;
        }
        if (cVarH.o(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            Object objV = cVarH.v();
            if (objV == b.a.a) {
                objV = c70.a;
                cVarH.p(objV);
            }
            ag9 ag9Var = (ag9) objV;
            int iHashCode = Long.hashCode(cVarH.T);
            t8b t8bVarP = cVarH.P();
            androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(cVarH, eVar);
            gl2.j.getClass();
            pm8.a aVar = gl2.a.b;
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
            cVarH.B();
            if (cVarH.S) {
                cVarH.y(aVar);
            } else {
                cVarH.n();
            }
            ygg.y(cVarH, ag9Var, gl2.a.g);
            ygg.y(cVarH, t8bVarP, gl2.a.f);
            gl2.a.C0251a c0251a = gl2.a.j;
            if (cVarH.S || !wl7.b(cVarH.v(), Integer.valueOf(iHashCode))) {
                ja.h(iHashCode, cVarH, iHashCode, c0251a);
            }
            ygg.y(cVarH, eVarC, gl2.a.d);
            function2.invoke(cVarH, Integer.valueOf((i5 >> 6) & 14));
            cVarH.U(true);
        } else {
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new d70(eVar, function2, i, i2);
        }
    }
}
