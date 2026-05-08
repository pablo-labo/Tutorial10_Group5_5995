package defpackage;

import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.ui.e;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.indeed.android.jobsearch.R;
import defpackage.c20;
import defpackage.f1f;
import defpackage.gl2;
import defpackage.pm8;
import defpackage.xzg;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hv9 {
    public static final long a = vfd.b(0.5f, 0.0f);
    public static final /* synthetic */ int b = 0;

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, mzg> {
        public static final a a = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final mzg invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            num.intValue();
            bVar2.L(58488196);
            WeakHashMap<View, xzg> weakHashMap = xzg.v;
            nw8 nw8Var = new nw8(xzg.a.c(bVar2).k, 32);
            bVar2.F();
            return nw8Var;
        }
    }

    public static final class b extends mj8 implements gu5<j6g> {
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;
        final /* synthetic */ e13 $scope;
        final /* synthetic */ hee $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hee heeVar, e13 e13Var, zb0<Float, ce0> zb0Var, gu5<j6g> gu5Var) {
            super(0);
            this.$sheetState = heeVar;
            this.$scope = e13Var;
            this.$predictiveBackProgress = zb0Var;
            this.$onDismissRequest = gu5Var;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            if (((jee) ((gme) this.$sheetState.c.g).getValue()) == jee.b && this.$sheetState.c.e().d(jee.c)) {
                u63.Y(this.$scope, null, null, new iv9(this.$predictiveBackProgress, null), 3);
                u63.Y(this.$scope, null, null, new jv9(this.$sheetState, null), 3);
            } else {
                u63.Y(this.$scope, null, null, new kv9(this.$sheetState, null), 3).d0(new lv9(this.$onDismissRequest));
            }
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ gu5<j6g> $animateToDismiss;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, mzg> $contentWindowInsets;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $dragHandle;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;
        final /* synthetic */ e13 $scope;
        final /* synthetic */ long $scrimColor;
        final /* synthetic */ Function1<Float, j6g> $settleToDismiss;
        final /* synthetic */ dce $shape;
        final /* synthetic */ float $sheetMaxWidth;
        final /* synthetic */ hee $sheetState;
        final /* synthetic */ float $tonalElevation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(long j, gu5<j6g> gu5Var, hee heeVar, zb0<Float, ce0> zb0Var, e13 e13Var, Function1<? super Float, j6g> function1, androidx.compose.ui.e eVar, float f, dce dceVar, long j2, long j3, float f2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends mzg> function22, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var) {
            super(2);
            this.$scrimColor = j;
            this.$animateToDismiss = gu5Var;
            this.$sheetState = heeVar;
            this.$predictiveBackProgress = zb0Var;
            this.$scope = e13Var;
            this.$settleToDismiss = function1;
            this.$modifier = eVar;
            this.$sheetMaxWidth = f;
            this.$shape = dceVar;
            this.$containerColor = j2;
            this.$contentColor = j3;
            this.$tonalElevation = f2;
            this.$dragHandle = function2;
            this.$contentWindowInsets = function22;
            this.$content = wu5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                androidx.compose.ui.e eVarB = b5e.b(androidx.compose.ui.c.a(androidx.compose.foundation.layout.g.d(e.a.b, 1.0f), tf7.a, new a0h()), false, mv9.a);
                long j = this.$scrimColor;
                gu5<j6g> gu5Var = this.$animateToDismiss;
                hee heeVar = this.$sheetState;
                zb0<Float, ce0> zb0Var = this.$predictiveBackProgress;
                e13 e13Var = this.$scope;
                Function1<Float, j6g> function1 = this.$settleToDismiss;
                androidx.compose.ui.e eVar = this.$modifier;
                float f = this.$sheetMaxWidth;
                dce dceVar = this.$shape;
                long j2 = this.$containerColor;
                long j3 = this.$contentColor;
                float f2 = this.$tonalElevation;
                Function2<androidx.compose.runtime.b, Integer, j6g> function2 = this.$dragHandle;
                Function2<androidx.compose.runtime.b, Integer, mzg> function22 = this.$contentWindowInsets;
                wu5<pb2, androidx.compose.runtime.b, Integer, j6g> wu5Var = this.$content;
                ag9 ag9VarD = hl1.d(c20.a.a, false);
                int iG = bVar2.G();
                t8b t8bVarM = bVar2.m();
                androidx.compose.ui.e eVarC = androidx.compose.ui.c.c(bVar2, eVarB);
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
                ygg.y(bVar2, ag9VarD, gl2.a.g);
                ygg.y(bVar2, t8bVarM, gl2.a.f);
                gl2.a.C0251a c0251a = gl2.a.j;
                if (bVar2.f() || !wl7.b(bVar2.v(), Integer.valueOf(iG))) {
                    uz.g(iG, bVar2, iG, c0251a);
                }
                ygg.y(bVar2, eVarC, gl2.a.d);
                hv9.c(j, gu5Var, ((jee) heeVar.c.h.getValue()) != jee.a, bVar2, 0);
                hv9.b(androidx.compose.foundation.layout.b.a, zb0Var, e13Var, gu5Var, function1, eVar, heeVar, f, dceVar, j2, j3, f2, function2, function22, wu5Var, bVar2, 70, 0, 0);
                bVar2.q();
            }
            return j6g.a;
        }
    }

    @uh3(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4$1", f = "ModalBottomSheet.kt", l = {194}, m = "invokeSuspend")
    public static final class d extends c1f implements Function2<e13, lu2<? super j6g>, Object> {
        final /* synthetic */ hee $sheetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(hee heeVar, lu2<? super d> lu2Var) {
            super(2, lu2Var);
            this.$sheetState = heeVar;
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
            int i = this.label;
            if (i == 0) {
                r7d.b(obj);
                hee heeVar = this.$sheetState;
                this.label = 1;
                Object objE = heeVar.e(this);
                g13 g13Var = g13.a;
                if (objE == g13Var) {
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

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, mzg> $contentWindowInsets;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $dragHandle;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ fw9 $properties;
        final /* synthetic */ long $scrimColor;
        final /* synthetic */ dce $shape;
        final /* synthetic */ float $sheetMaxWidth;
        final /* synthetic */ hee $sheetState;
        final /* synthetic */ float $tonalElevation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(gu5<j6g> gu5Var, androidx.compose.ui.e eVar, hee heeVar, float f, dce dceVar, long j, long j2, float f2, long j3, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends mzg> function22, fw9 fw9Var, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2, int i3) {
            super(2);
            this.$onDismissRequest = gu5Var;
            this.$modifier = eVar;
            this.$sheetState = heeVar;
            this.$sheetMaxWidth = f;
            this.$shape = dceVar;
            this.$containerColor = j;
            this.$contentColor = j2;
            this.$tonalElevation = f2;
            this.$scrimColor = j3;
            this.$dragHandle = function2;
            this.$contentWindowInsets = function22;
            this.$properties = fw9Var;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            hv9.a(this.$onDismissRequest, this.$modifier, this.$sheetState, this.$sheetMaxWidth, this.$shape, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$scrimColor, this.$dragHandle, this.$contentWindowInsets, this.$properties, this.$content, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    public static final class f extends mj8 implements gu5<j6g> {
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ e13 $scope;
        final /* synthetic */ hee $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e13 e13Var, gu5 gu5Var, hee heeVar) {
            super(0);
            this.$sheetState = heeVar;
            this.$scope = e13Var;
            this.$onDismissRequest = gu5Var;
        }

        @Override // defpackage.gu5
        public final j6g invoke() {
            if (this.$sheetState.c.d.invoke(jee.a).booleanValue()) {
                u63.Y(this.$scope, null, null, new nv9(this.$sheetState, null), 3).d0(new ov9(this.$sheetState, this.$onDismissRequest));
            }
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function1<Float, j6g> {
        final /* synthetic */ gu5<j6g> $onDismissRequest;
        final /* synthetic */ e13 $scope;
        final /* synthetic */ hee $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e13 e13Var, gu5 gu5Var, hee heeVar) {
            super(1);
            this.$scope = e13Var;
            this.$sheetState = heeVar;
            this.$onDismissRequest = gu5Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(Float f) {
            u63.Y(this.$scope, null, null, new pv9(this.$sheetState, f.floatValue(), null), 3).d0(new qv9(this.$sheetState, this.$onDismissRequest));
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements Function2<androidx.compose.runtime.b, Integer, mzg> {
        public static final h a = new h(2);

        @Override // kotlin.jvm.functions.Function2
        public final mzg invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            num.intValue();
            bVar2.L(-11444670);
            WeakHashMap<View, xzg> weakHashMap = xzg.v;
            nw8 nw8Var = new nw8(xzg.a.c(bVar2).k, 32);
            bVar2.F();
            return nw8Var;
        }
    }

    public static final class i extends mj8 implements Function2<th7, iq2, Pair<? extends oa4<jee>, ? extends jee>> {
        final /* synthetic */ hee $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(hee heeVar) {
            super(2);
            this.$sheetState = heeVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[PHI: r3
  0x004b: PHI (r3v10 jee) = (r3v8 jee), (r3v9 jee) binds: [B:12:0x0049, B:15:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.jvm.functions.Function2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.Pair<? extends defpackage.oa4<defpackage.jee>, ? extends defpackage.jee> invoke(defpackage.th7 r4, defpackage.iq2 r5) {
            /*
                r3 = this;
                th7 r4 = (defpackage.th7) r4
                long r0 = r4.a
                iq2 r5 = (defpackage.iq2) r5
                long r4 = r5.a
                int r4 = defpackage.iq2.g(r4)
                float r4 = (float) r4
                rv9 r5 = new rv9
                hee r2 = r3.$sheetState
                r5.<init>(r4, r0, r2)
                lb9 r4 = new lb9
                qa4 r0 = new qa4
                r0.<init>()
                r5.invoke(r0)
                java.util.LinkedHashMap r5 = r0.a
                r4.<init>(r5)
                hee r3 = r3.$sheetState
                q30<jee> r3 = r3.c
                az3 r3 = r3.h
                java.lang.Object r3 = r3.getValue()
                jee r3 = (defpackage.jee) r3
                int r3 = r3.ordinal()
                jee r0 = defpackage.jee.a
                if (r3 == 0) goto L56
                r1 = 1
                if (r3 == r1) goto L43
                r1 = 2
                if (r3 != r1) goto L3e
                goto L43
            L3e:
                defpackage.l.g()
                r3 = 0
                return r3
            L43:
                jee r3 = defpackage.jee.c
                boolean r1 = r5.containsKey(r3)
                if (r1 == 0) goto L4d
            L4b:
                r0 = r3
                goto L56
            L4d:
                jee r3 = defpackage.jee.b
                boolean r5 = r5.containsKey(r3)
                if (r5 == 0) goto L56
                goto L4b
            L56:
                kotlin.Pair r3 = new kotlin.Pair
                r3.<init>(r4, r0)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: hv9.i.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    @uh3(c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1", f = "ModalBottomSheet.kt", l = {}, m = "invokeSuspend")
    public static final class j extends c1f implements wu5<e13, Float, lu2<? super j6g>, Object> {
        final /* synthetic */ Function1<Float, j6g> $settleToDismiss;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(Function1<? super Float, j6g> function1, lu2<? super j> lu2Var) {
            super(3, lu2Var);
            this.$settleToDismiss = function1;
        }

        @Override // defpackage.x81
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                r6.g("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r7d.b(obj);
            this.$settleToDismiss.invoke(new Float(this.F$0));
            return j6g.a;
        }

        @Override // defpackage.wu5
        public final Object q(e13 e13Var, Float f, lu2<? super j6g> lu2Var) {
            float fFloatValue = f.floatValue();
            j jVar = new j(this.$settleToDismiss, lu2Var);
            jVar.F$0 = fFloatValue;
            return jVar.invokeSuspend(j6g.a);
        }
    }

    public static final class k extends mj8 implements Function1<s5e, j6g> {
        final /* synthetic */ String $bottomSheetPaneTitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(1);
            this.$bottomSheetPaneTitle = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(s5e s5eVar) {
            s5e s5eVar2 = s5eVar;
            o5e.h(s5eVar2, this.$bottomSheetPaneTitle);
            o5e.l(s5eVar2, 0.0f);
            return j6g.a;
        }
    }

    public static final class l extends mj8 implements Function1<cd6, j6g> {
        final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;
        final /* synthetic */ hee $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(hee heeVar, zb0<Float, ce0> zb0Var) {
            super(1);
            this.$sheetState = heeVar;
            this.$predictiveBackProgress = zb0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(cd6 cd6Var) {
            cd6 cd6Var2 = cd6Var;
            float fG = ((cme) this.$sheetState.c.j).g();
            float fB = kie.b(cd6Var2.c());
            if (!Float.isNaN(fG) && !Float.isNaN(fB) && fB != 0.0f) {
                float fFloatValue = this.$predictiveBackProgress.d().floatValue();
                cd6Var2.m(hv9.d(cd6Var2, fFloatValue));
                cd6Var2.u(hv9.e(cd6Var2, fFloatValue));
                cd6Var2.y0(vfd.b(0.5f, (fG + fB) / fB));
            }
            return j6g.a;
        }
    }

    public static final class m extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ gu5<j6g> $animateToDismiss;
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, mzg> $contentWindowInsets;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $dragHandle;
        final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;
        final /* synthetic */ e13 $scope;
        final /* synthetic */ hee $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends mzg> function2, zb0<Float, ce0> zb0Var, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function22, hee heeVar, gu5<j6g> gu5Var, e13 e13Var, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var) {
            super(2);
            this.$contentWindowInsets = function2;
            this.$predictiveBackProgress = zb0Var;
            this.$dragHandle = function22;
            this.$sheetState = heeVar;
            this.$animateToDismiss = gu5Var;
            this.$scope = e13Var;
            this.$content = wu5Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x019a  */
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
        @Override // kotlin.jvm.functions.Function2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final defpackage.j6g invoke(androidx.compose.runtime.b r20, java.lang.Integer r21) {
            /*
                Method dump skipped, instruction units count: 435
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: hv9.m.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public static final class n extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ gu5<j6g> $animateToDismiss;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ wu5<pb2, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, mzg> $contentWindowInsets;
        final /* synthetic */ Function2<androidx.compose.runtime.b, Integer, j6g> $dragHandle;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ zb0<Float, ce0> $predictiveBackProgress;
        final /* synthetic */ e13 $scope;
        final /* synthetic */ Function1<Float, j6g> $settleToDismiss;
        final /* synthetic */ dce $shape;
        final /* synthetic */ float $sheetMaxWidth;
        final /* synthetic */ hee $sheetState;
        final /* synthetic */ ml1 $this_ModalBottomSheetContent;
        final /* synthetic */ float $tonalElevation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(ml1 ml1Var, zb0<Float, ce0> zb0Var, e13 e13Var, gu5<j6g> gu5Var, Function1<? super Float, j6g> function1, androidx.compose.ui.e eVar, hee heeVar, float f, dce dceVar, long j, long j2, float f2, Function2<? super androidx.compose.runtime.b, ? super Integer, j6g> function2, Function2<? super androidx.compose.runtime.b, ? super Integer, ? extends mzg> function22, wu5<? super pb2, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2, int i3) {
            super(2);
            this.$this_ModalBottomSheetContent = ml1Var;
            this.$predictiveBackProgress = zb0Var;
            this.$scope = e13Var;
            this.$animateToDismiss = gu5Var;
            this.$settleToDismiss = function1;
            this.$modifier = eVar;
            this.$sheetState = heeVar;
            this.$sheetMaxWidth = f;
            this.$shape = dceVar;
            this.$containerColor = j;
            this.$contentColor = j2;
            this.$tonalElevation = f2;
            this.$dragHandle = function2;
            this.$contentWindowInsets = function22;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            hv9.b(this.$this_ModalBottomSheetContent, this.$predictiveBackProgress, this.$scope, this.$animateToDismiss, this.$settleToDismiss, this.$modifier, this.$sheetState, this.$sheetMaxWidth, this.$shape, this.$containerColor, this.$contentColor, this.$tonalElevation, this.$dragHandle, this.$contentWindowInsets, this.$content, bVar, ka2.L(this.$$changed | 1), ka2.L(this.$$changed1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0321 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.gu5<defpackage.j6g> r44, androidx.compose.ui.e r45, defpackage.hee r46, float r47, defpackage.dce r48, long r49, long r51, float r53, long r54, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, ? extends defpackage.mzg> r57, defpackage.fw9 r58, defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r59, androidx.compose.runtime.b r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv9.a(gu5, androidx.compose.ui.e, hee, float, dce, long, long, float, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, fw9, wu5, androidx.compose.runtime.b, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x030f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.ml1 r38, defpackage.zb0<java.lang.Float, defpackage.ce0> r39, defpackage.e13 r40, defpackage.gu5<defpackage.j6g> r41, kotlin.jvm.functions.Function1<? super java.lang.Float, defpackage.j6g> r42, androidx.compose.ui.e r43, defpackage.hee r44, float r45, defpackage.dce r46, long r47, long r49, float r51, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r52, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.b, ? super java.lang.Integer, ? extends defpackage.mzg> r53, defpackage.wu5<? super defpackage.pb2, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r54, androidx.compose.runtime.b r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instruction units count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv9.b(ml1, zb0, e13, gu5, kotlin.jvm.functions.Function1, androidx.compose.ui.e, hee, float, dce, long, long, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, wu5, androidx.compose.runtime.b, int, int, int):void");
    }

    public static final void c(long j2, gu5 gu5Var, boolean z, androidx.compose.runtime.b bVar, int i2) {
        int i3;
        androidx.compose.ui.e eVarB;
        boolean z2;
        androidx.compose.runtime.c cVarH = bVar.h(951870469);
        if ((i2 & 6) == 0) {
            i3 = (cVarH.e(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= cVarH.x(gu5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= cVarH.a(z) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if ((i3 & 147) == 146 && cVarH.i()) {
            cVarH.D();
        } else if (j2 != 16) {
            ese eseVarB = vc0.b(z ? 1.0f : 0.0f, new dvf(0, (af4) null, 7), null, cVarH, 48, 28);
            String strV = boa.v(R.string.close_sheet, cVarH);
            cVarH.L(-1785653838);
            e.a aVar = e.a.b;
            b.a.C0020a c0020a = b.a.a;
            if (z) {
                int i4 = i3 & 112;
                boolean z3 = i4 == 32;
                Object objV = cVarH.v();
                if (z3 || objV == c0020a) {
                    objV = new bw9(gu5Var, null);
                    cVarH.p(objV);
                }
                androidx.compose.ui.e eVarO = aVar.o(new SuspendPointerInputElement(gu5Var, null, new f1f.a((Function2) objV), 6));
                boolean zK = (i4 == 32) | cVarH.K(strV);
                Object objV2 = cVarH.v();
                if (zK || objV2 == c0020a) {
                    objV2 = new dw9(strV, gu5Var);
                    cVarH.p(objV2);
                }
                eVarB = b5e.b(eVarO, true, (Function1) objV2);
                z2 = false;
            } else {
                eVarB = aVar;
                z2 = false;
            }
            cVarH.U(z2);
            androidx.compose.ui.e eVarO2 = androidx.compose.foundation.layout.g.d(aVar, 1.0f).o(eVarB);
            boolean zK2 = cVarH.K(eseVarB) | ((i3 & 14) == 4);
            Object objV3 = cVarH.v();
            if (zK2 || objV3 == c0020a) {
                objV3 = new zv9(j2, eseVarB);
                cVarH.p(objV3);
            }
            w74.a(eVarO2, (Function1) objV3, cVarH, 0);
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new aw9(j2, gu5Var, z, i2);
        }
    }

    public static final float d(cd6 cd6Var, float f2) {
        float fD = kie.d(cd6Var.c());
        if (Float.isNaN(fD) || fD == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (w74.t(0.0f, Math.min(cd6Var.t1(48.0f), fD), f2) / fD);
    }

    public static final float e(cd6 cd6Var, float f2) {
        float fB = kie.b(cd6Var.c());
        if (Float.isNaN(fB) || fB == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (w74.t(0.0f, Math.min(cd6Var.t1(24.0f), fB), f2) / fB);
    }

    public static final hee f(boolean z, androidx.compose.runtime.b bVar, int i2, int i3) {
        boolean z2 = true;
        if ((i3 & 1) != 0) {
            z = false;
        }
        ew9 ew9Var = ew9.a;
        int i4 = (i2 & 14) | 384;
        dvf dvfVar = cee.a;
        iy3 iy3Var = (iy3) bVar.M(um2.h);
        Object[] objArr = {Boolean.valueOf(z), ew9Var, Boolean.FALSE};
        ko2 ko2Var = new ko2(fee.a, new gee(z, iy3Var, ew9Var));
        if ((((i4 & 14) ^ 6) <= 4 || !bVar.a(z)) && (i4 & 6) != 4) {
            z2 = false;
        }
        boolean zK = bVar.K(iy3Var) | z2 | bVar.K(ew9Var) | bVar.a(false);
        Object objV = bVar.v();
        if (zK || objV == b.a.a) {
            objV = new bee(z, iy3Var, jee.a, ew9Var);
            bVar.p(objV);
        }
        return (hee) ypd.O(objArr, ko2Var, (gu5) objV, bVar, 0, 4);
    }
}
