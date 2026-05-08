package androidx.compose.material;

import androidx.compose.foundation.layout.g;
import androidx.compose.material.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.i;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.af4;
import defpackage.b5e;
import defpackage.c1f;
import defpackage.c20;
import defpackage.dvf;
import defpackage.e13;
import defpackage.efb;
import defpackage.ese;
import defpackage.ewa;
import defpackage.f1f;
import defpackage.fj;
import defpackage.g13;
import defpackage.gl2;
import defpackage.gu5;
import defpackage.hw9;
import defpackage.i8f;
import defpackage.iw9;
import defpackage.iy3;
import defpackage.j6g;
import defpackage.jm0;
import defpackage.ko2;
import defpackage.lu2;
import defpackage.mb2;
import defpackage.ob2;
import defpackage.pa4;
import defpackage.pb2;
import defpackage.pg8;
import defpackage.pm8;
import defpackage.qb2;
import defpackage.r6;
import defpackage.r7d;
import defpackage.t8b;
import defpackage.uh3;
import defpackage.um2;
import defpackage.uz;
import defpackage.vc0;
import defpackage.vs0;
import defpackage.w34;
import defpackage.w74;
import defpackage.wl7;
import defpackage.wu5;
import defpackage.xi;
import defpackage.ygg;
import defpackage.ypd;
import defpackage.yu9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.compose.material.a$a, reason: collision with other inner class name */
    @uh3(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1$1", f = "ModalBottomSheet.kt", l = {363}, m = "invokeSuspend")
    public static final class C0016a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0016a(hw9 hw9Var, lu2<? super C0016a> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new C0016a(this.$sheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((C0016a) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$sheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$1$1", f = "ModalBottomSheet.kt", l = {DataOkHttpUploader.HTTP_UNAUTHORIZED}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hw9 hw9Var, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$sheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$sheetState;
                this.label = 1;
                Object objB = hw9Var.b(this);
                g13 g13Var = g13.a;
                if (objB == g13Var) {
                    return g13Var;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$2$1", f = "ModalBottomSheet.kt", l = {414}, m = "invokeSuspend")
    public static final class c extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(hw9 hw9Var, lu2<? super c> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new c(this.$sheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((c) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object objA;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$sheetState;
                this.label = 1;
                pa4<iw9> pa4VarE = hw9Var.c.e();
                iw9 iw9Var = iw9.b;
                boolean zD = pa4VarE.d(iw9Var);
                Object obj2 = g13.a;
                if (!zD || (objA = hw9.a(hw9Var, iw9Var, this)) != obj2) {
                    objA = j6g.a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1$3$1", f = "ModalBottomSheet.kt", l = {425}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hw9 $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(hw9 hw9Var, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = hw9Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new d(this.$sheetState, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            Object objA;
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hw9 hw9Var = this.$sheetState;
                this.label = 1;
                pa4<iw9> pa4VarE = hw9Var.c.e();
                iw9 iw9Var = iw9.c;
                boolean zD = pa4VarE.d(iw9Var);
                Object obj2 = g13.a;
                if (!zD || (objA = hw9.a(hw9Var, iw9Var, this)) != obj2) {
                    objA = j6g.a;
                }
                if (objA == obj2) {
                    return obj2;
                }
            } else {
                if (i != 1) {
                    r6.g("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r7d.b(obj);
            }
            return j6g.a;
        }
    }

    public static final class e implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        public final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> a;

        /* JADX WARN: Multi-variable type inference failed */
        public e(wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var) {
            this.a = wu5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            int iIntValue = num.intValue();
            if (bVar2.o(iIntValue & 1, (iIntValue & 3) != 2)) {
                ob2 ob2VarA = mb2.a(vs0.c, c20.a.m, bVar2, 0);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, e.a.b);
                gl2.j.getClass();
                pm8.a aVar = gl2.a.b;
                if (bVar2.j() == null) {
                    pg8.B();
                    throw null;
                }
                bVar2.B();
                if (bVar2.f()) {
                    bVar2.y(aVar);
                } else {
                    bVar2.n();
                }
                ygg.y(bVar2, ob2VarA, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                this.a.q(qb2.a, bVar2, 6);
                bVar2.q();
            } else {
                bVar2.D();
            }
            return j6g.a;
        }
    }

    public static final class f implements PointerInputEventHandler {
        public final /* synthetic */ gu5<j6g> a;

        public f(gu5<j6g> gu5Var) {
            this.a = gu5Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(efb efbVar, lu2<? super j6g> lu2Var) {
            Object objE = i8f.e(efbVar, new fj(this.a, 10), lu2Var);
            return objE == g13.a ? objE : j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r30, androidx.compose.ui.e r31, final defpackage.hw9 r32, boolean r33, defpackage.dce r34, float r35, long r36, long r38, long r40, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r42, androidx.compose.runtime.b r43, final int r44, final int r45) {
        /*
            Method dump skipped, instruction units count: 1032
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.a.a(wu5, androidx.compose.ui.e, hw9, boolean, dce, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.b, int, int):void");
    }

    public static final void b(final long j, final gu5<j6g> gu5Var, final boolean z, androidx.compose.runtime.b bVar, final int i) {
        int i2;
        androidx.compose.ui.e eVarB;
        androidx.compose.runtime.c cVarH = bVar.h(-526532668);
        if ((i & 6) == 0) {
            i2 = (cVarH.e(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.x(gu5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (!cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            cVarH.D();
        } else if (j != 16) {
            cVarH.L(-714009568);
            final ese eseVarB = vc0.b(z ? 1.0f : 0.0f, new dvf(0, (af4) null, 7), null, cVarH, 48, 28);
            String strU = ewa.u(2, cVarH);
            e.a aVar = e.a.b;
            b.a.C0020a c0020a = b.a.a;
            if (z) {
                cVarH.L(-713791669);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objV = cVarH.v();
                if (z2 || objV == c0020a) {
                    objV = new f(gu5Var);
                    cVarH.p(objV);
                }
                androidx.compose.ui.e eVarB2 = f1f.b(aVar, gu5Var, (PointerInputEventHandler) objV);
                boolean zK = (i3 == 32) | cVarH.K(strU);
                Object objV2 = cVarH.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new w34(6, strU, gu5Var);
                    cVarH.p(objV2);
                }
                eVarB = b5e.b(eVarB2, true, (Function1) objV2);
                cVarH.U(false);
            } else {
                cVarH.L(-713427946);
                cVarH.U(false);
                eVarB = aVar;
            }
            androidx.compose.ui.e eVarO = g.d(aVar, 1.0f).o(eVarB);
            boolean zK2 = cVarH.K(eseVarB) | ((i2 & 14) == 4);
            Object objV3 = cVarH.v();
            if (zK2 || objV3 == c0020a) {
                objV3 = new Function1() { // from class: ev9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        gb4.o1((gb4) obj, j, 0L, 0L, nic.B(((Number) eseVarB.getValue()).floatValue(), 0.0f, 1.0f), null, 118);
                        return j6g.a;
                    }
                };
                cVarH.p(objV3);
            }
            w74.a(eVarO, (Function1) objV3, cVarH, 0);
            cVarH.U(false);
        } else {
            cVarH.L(-713242690);
            cVarH.U(false);
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: fv9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a.b(j, gu5Var, z, (b) obj, ka2.L(i | 1));
                    return j6g.a;
                }
            };
        }
    }

    public static final hw9 c(final iw9 iw9Var, Function1 function1, androidx.compose.runtime.b bVar, int i, int i2) {
        final dvf dvfVar = yu9.a;
        int i3 = i2 & 4;
        int i4 = 8;
        Object obj = b.a.a;
        if (i3 != 0) {
            Object objV = bVar.v();
            if (objV == obj) {
                objV = new xi(i4);
                bVar.p(objV);
            }
            function1 = (Function1) objV;
        }
        final Function1 function12 = function1;
        int i5 = i2 & 8;
        boolean z = true;
        final boolean z2 = i5 == 0;
        final iy3 iy3Var = (iy3) bVar.M(um2.h);
        bVar.A(-1222943993, iw9Var);
        Object[] objArr = {iw9Var, dvfVar, Boolean.valueOf(z2), function12, iy3Var};
        ko2 ko2Var = new ko2(new jm0(9), new Function1() { // from class: gw9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return new hw9((iw9) obj2, iy3Var, function12, dvfVar, z2);
            }
        });
        boolean zK = bVar.K(iy3Var) | ((((i & 896) ^ 384) > 256 && bVar.K(function12)) || (i & 384) == 256) | bVar.x(dvfVar);
        if ((((i & 7168) ^ 3072) <= 2048 || !bVar.a(z2)) && (i & 3072) != 2048) {
            z = false;
        }
        boolean z3 = zK | z;
        Object objV2 = bVar.v();
        if (z3 || objV2 == obj) {
            Object obj2 = new gu5() { // from class: cv9
                @Override // defpackage.gu5
                public final Object invoke() {
                    return new hw9(iw9Var, iy3Var, function12, dvfVar, z2);
                }
            };
            bVar.p(obj2);
            objV2 = obj2;
        }
        hw9 hw9Var = (hw9) ypd.N(objArr, ko2Var, (gu5) objV2, bVar, 0);
        bVar.I();
        return hw9Var;
    }
}
