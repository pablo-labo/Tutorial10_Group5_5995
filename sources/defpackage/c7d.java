package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.runtime.i;
import androidx.compose.runtime.r;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.f;
import com.datadog.android.core.internal.data.upload.DataOkHttpUploader;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.af1;
import defpackage.c20;
import defpackage.gl2;
import defpackage.o97;
import defpackage.pm8;
import defpackage.sp7;
import defpackage.vs0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class c7d {

    @uh3(c = "com.indeed.android.sharedui.responsiveness.ResponsiveBadgeKt$ResponsiveBadge$2$1", f = "ResponsiveBadge.kt", l = {}, m = "invokeSuspend")
    public static final class a extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ gu5<j6g> $onDisplay;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gu5<j6g> gu5Var, lu2<? super a> lu2Var) {
            super(2, lu2Var);
            this.$onDisplay = gu5Var;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new a(this.$onDisplay, lu2Var);
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
            this.$onDisplay.invoke();
            return j6g.a;
        }
    }

    @uh3(c = "com.indeed.android.sharedui.responsiveness.ResponsiveBadgeKt$ResponsiveBadgeBottomSheet$1$1", f = "ResponsiveBadge.kt", l = {}, m = "invokeSuspend")
    public static final class b extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ boolean $isEarned;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, lu2<? super b> lu2Var) {
            super(2, lu2Var);
            this.$isEarned = z;
        }

        @Override // defpackage.x81
        public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
            return new b(this.$isEarned, lu2Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(e13 e13Var, lu2<? super j6g> lu2Var) {
            return ((b) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            q6.n(this.$isEarned ? "responsiveStatusEarnedSheet" : "responsiveStatusIntroSheet", null, null, 6, (tp7) cr8.p(tp7.class));
            return j6g.a;
        }
    }

    public static final void a(e eVar, final i7d i7dVar, gu5<j6g> gu5Var, androidx.compose.runtime.b bVar, final int i, final int i2) {
        int i3;
        i7dVar.getClass();
        c cVarH = bVar.h(-996318334);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (cVarH.K(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= cVarH.K(i7dVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= cVarH.x(gu5Var) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                eVar = e.a.b;
            }
            b.a.C0020a c0020a = b.a.a;
            if (i5 != 0) {
                Object objV = cVarH.v();
                if (objV == c0020a) {
                    objV = new qr0(13);
                    cVarH.p(objV);
                }
                gu5Var = (gu5) objV;
            }
            j6g j6gVar = j6g.a;
            boolean z = (i3 & 896) == 256;
            Object objV2 = cVarH.v();
            if (z || objV2 == c0020a) {
                objV2 = new a(gu5Var, null);
                cVarH.p(objV2);
            }
            to4.d(cVarH, j6gVar, (Function2) objV2);
            if (i7dVar.e) {
                cVarH.L(1199785337);
                c(i7dVar, eVar, cVarH, ((i3 >> 3) & 14) | ((i3 << 3) & 112));
            } else {
                cVarH.L(1197850720);
            }
            cVarH.U(false);
        } else {
            cVarH.D();
        }
        final e eVar2 = eVar;
        final gu5<j6g> gu5Var2 = gu5Var;
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: a7d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    c7d.a(eVar2, i7dVar, gu5Var2, (b) obj, ka2.L(i | 1), i2);
                    return j6g.a;
                }
            };
        }
    }

    public static final void b(final gu5<j6g> gu5Var, hee heeVar, final boolean z, androidx.compose.runtime.b bVar, final int i) {
        int i2;
        final gu5<j6g> gu5Var2;
        final hee heeVar2;
        final fk1 fk1Var;
        gu5Var.getClass();
        heeVar.getClass();
        c cVarH = bVar.h(610532905);
        if ((i & 6) == 0) {
            i2 = (cVarH.x(gu5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(heeVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= cVarH.a(z) ? 256 : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i2 & 1, (i2 & 147) != 146)) {
            j6g j6gVar = j6g.a;
            boolean z2 = (i2 & 896) == 256;
            Object objV = cVarH.v();
            if (z2 || objV == b.a.a) {
                objV = new b(z, null);
                cVarH.p(objV);
            }
            to4.d(cVarH, j6gVar, (Function2) objV);
            final o97 o97Var = (o97) cVarH.M(p97.a);
            if (z) {
                cVarH.L(-800384703);
                fk1Var = new fk1(ak2.I(R.string.responsive_bottomsheet_active_title, cVarH), ak2.I(R.string.responsive_bottomsheet_active_content, cVarH), ka2.c);
                cVarH.U(false);
            } else {
                cVarH.L(-800100774);
                fk1Var = new fk1(ak2.I(R.string.responsive_bottomsheet_inactive_title, cVarH), ak2.I(R.string.responsive_bottomsheet_inactive_content, cVarH), ka2.d);
                cVarH.U(false);
            }
            gu5Var2 = gu5Var;
            heeVar2 = heeVar;
            nx6.a(gu5Var2, null, heeVar2, null, false, null, bh2.c(2079901135, new wu5() { // from class: x6d
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // defpackage.wu5
                public final Object q(Object obj, Object obj2, Object obj3) {
                    b bVar2 = (b) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((pb2) obj).getClass();
                    if (bVar2.o(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final gu5 gu5Var3 = gu5Var;
                        final o97 o97Var2 = o97Var;
                        final boolean z3 = z;
                        nx6.c("", null, false, false, false, null, null, bh2.c(-714133701, new wu5() { // from class: b7d
                            @Override // defpackage.wu5
                            public final Object q(Object obj4, Object obj5, Object obj6) {
                                b bVar3 = (b) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ((fhd) obj4).getClass();
                                if (bVar3.o(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    final boolean z4 = z3;
                                    boolean zA = bVar3.a(z4);
                                    final gu5 gu5Var4 = gu5Var3;
                                    boolean zK = zA | bVar3.K(gu5Var4);
                                    Object objV2 = bVar3.v();
                                    if (zK || objV2 == b.a.a) {
                                        objV2 = new gu5() { // from class: y6d
                                            @Override // defpackage.gu5
                                            public final Object invoke() {
                                                ((tp7) cr8.p(tp7.class)).b(new sp7.g(z4 ? "responsiveStatusEarnedSheet" : "responsiveStatusIntroSheet", "close", null, null, 12));
                                                gu5Var4.invoke();
                                                return j6g.a;
                                            }
                                        };
                                        bVar3.p(objV2);
                                    }
                                    o97.g gVar = o97Var2.i;
                                    rq6.b((gu5) objV2, f.a(g.n(e.a.b, 24.0f), "CloseButton"), false, null, null, ka2.e, bVar3, 196608, 28);
                                } else {
                                    bVar3.D();
                                }
                                return j6g.a;
                            }
                        }, bVar2), null, null, bVar2, 12582918, 894);
                        af1.a aVar = c20.a.m;
                        vs0.k kVar = vs0.c;
                        ob2 ob2VarA = mb2.a(kVar, aVar, bVar2, 0);
                        int iHashCode = Long.hashCode(bVar2.k());
                        t8b t8bVarM = bVar2.m();
                        e.a aVar2 = e.a.b;
                        e eVarC = androidx.compose.ui.c.c(bVar2, aVar2);
                        gl2.j.getClass();
                        pm8.a aVar3 = gl2.a.b;
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar3);
                        } else {
                            bVar2.n();
                        }
                        gl2.a.d dVar = gl2.a.g;
                        ygg.y(bVar2, ob2VarA, dVar);
                        gl2.a.f fVar = gl2.a.f;
                        ygg.y(bVar2, t8bVarM, fVar);
                        gl2.a.C0251a c0251a = gl2.a.j;
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode))) {
                            uz.g(iHashCode, bVar2, iHashCode, c0251a);
                        }
                        gl2.a.e eVar = gl2.a.d;
                        ygg.y(bVar2, eVarC, eVar);
                        fk1 fk1Var2 = fk1Var;
                        fk1Var2.c.invoke(bVar2, 0);
                        o97.g gVar = o97Var2.i;
                        e eVarF = androidx.compose.foundation.layout.f.f(aVar2, 24.0f);
                        ob2 ob2VarA2 = mb2.a(kVar, c20.a.n, bVar2, 48);
                        int iHashCode2 = Long.hashCode(bVar2.k());
                        t8b t8bVarM2 = bVar2.m();
                        e eVarC2 = androidx.compose.ui.c.c(bVar2, eVarF);
                        if (bVar2.j() == null) {
                            pg8.B();
                            throw null;
                        }
                        bVar2.B();
                        if (bVar2.f()) {
                            bVar2.y(aVar3);
                        } else {
                            bVar2.n();
                        }
                        ygg.y(bVar2, ob2VarA2, dVar);
                        ygg.y(bVar2, t8bVarM2, fVar);
                        if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iHashCode2))) {
                            uz.g(iHashCode2, bVar2, iHashCode2, c0251a);
                        }
                        ygg.y(bVar2, eVarC2, eVar);
                        String str = fk1Var2.a;
                        tjf tjfVarA = tjf.a(o97Var2.j.e, o97Var2.c.a.c, 0L, o97Var2.f.c, null, null, 0L, 0, 0L, null, null, 0, 16777210);
                        Object objV2 = bVar2.v();
                        b.a.C0020a c0020a = b.a.a;
                        if (objV2 == c0020a) {
                            objV2 = new tr(14);
                            bVar2.p(objV2);
                        }
                        cif.b(str, b5e.b(aVar2, false, (Function1) objV2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, tjfVarA, bVar2, 0, 0, 65532);
                        jh2.f(bVar2, g.h(aVar2, 12.0f));
                        vg2.b(fk1Var2.b, bVar2, 0);
                        jh2.f(bVar2, g.h(aVar2, 24.0f));
                        String strI = ak2.I(R.string.got_it, bVar2);
                        boolean zA = bVar2.a(z3) | bVar2.K(gu5Var3);
                        Object objV3 = bVar2.v();
                        if (zA || objV3 == c0020a) {
                            objV3 = new z6c(1, gu5Var3, z3);
                            bVar2.p(objV3);
                        }
                        gt6.h(strI, (gu5) objV3, g.f(aVar2, 1.0f), null, false, false, null, null, null, bVar2, 384, DataOkHttpUploader.HTTP_GATEWAY_TIMEOUT);
                        bVar2.q();
                        bVar2.q();
                    } else {
                        bVar2.D();
                    }
                    return j6g.a;
                }
            }, cVarH), cVarH, (i2 & 14) | 1572864 | ((i2 << 3) & 896), 58);
        } else {
            gu5Var2 = gu5Var;
            heeVar2 = heeVar;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new Function2() { // from class: z6d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iL = ka2.L(i | 1);
                    c7d.b(gu5Var2, heeVar2, z, (b) obj, iL);
                    return j6g.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(i7d i7dVar, e eVar, androidx.compose.runtime.b bVar, int i) {
        int i2;
        e eVar2;
        i7dVar.getClass();
        c cVarH = bVar.h(-542309866);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (cVarH.K(i7dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= cVarH.K(eVar) ? 32 : 16;
        }
        if (cVarH.o(i2 & 1, (i2 & 19) != 18)) {
            hee heeVarF = hv9.f(true, cVarH, 6, 2);
            Object objV = cVarH.v();
            b.a.C0020a c0020a = b.a.a;
            if (objV == c0020a) {
                objV = r.f(Boolean.FALSE);
                cVarH.p(objV);
            }
            g4a g4aVar = (g4a) objV;
            o97 o97Var = (o97) cVarH.M(p97.a);
            int i4 = 3;
            if (((Boolean) g4aVar.getValue()).booleanValue()) {
                cVarH.L(1714126663);
                Object objV2 = cVarH.v();
                if (objV2 == c0020a) {
                    objV2 = new vg4(3, g4aVar);
                    cVarH.p(objV2);
                }
                b((gu5) objV2, heeVarF, i7dVar.b, cVarH, 6);
            } else {
                cVarH.L(1711681228);
            }
            cVarH.U(false);
            Object objV3 = cVarH.v();
            if (objV3 == c0020a) {
                objV3 = new wl4(4, g4aVar);
                cVarH.p(objV3);
            }
            eVar2 = eVar;
            rq6.b((gu5) objV3, eVar2, false, null, null, bh2.c(100112921, new ug(i4, i7dVar, o97Var), cVarH), cVarH, (i2 & 112) | 196614, 28);
        } else {
            eVar2 = eVar;
            cVarH.D();
        }
        i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new pm2(i7dVar, i, i3, eVar2);
        }
    }
}
