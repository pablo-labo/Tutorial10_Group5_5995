package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.runtime.b;
import androidx.compose.runtime.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.dld;
import defpackage.dm2;
import defpackage.gl2;
import defpackage.gu5;
import defpackage.ikd;
import defpackage.iy3;
import defpackage.j6g;
import defpackage.ka2;
import defpackage.kkd;
import defpackage.l6;
import defpackage.mj8;
import defpackage.pm8;
import defpackage.rxa;
import defpackage.sm2;
import defpackage.uz;
import defpackage.vl8;
import defpackage.wl7;
import defpackage.ygg;
import defpackage.ypg;
import defpackage.zv8;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final h a = h.a;

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.a$a, reason: collision with other inner class name */
    public static final class C0024a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function1<Context, T> $factory;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1<T, j6g> $update;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0024a(Function1<? super Context, ? extends T> function1, androidx.compose.ui.e eVar, Function1<? super T, j6g> function12, int i, int i2) {
            super(2);
            this.$factory = function1;
            this.$modifier = eVar;
            this.$update = function12;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            a.a(this.$factory, this.$modifier, this.$update, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class b<T> extends mj8 implements Function2<pm8, Function1<? super T, ? extends j6g>, j6g> {
        public static final b a = new b(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, Object obj) {
            a.c(pm8Var).setResetBlock((Function1) obj);
            return j6g.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class c<T> extends mj8 implements Function2<pm8, Function1<? super T, ? extends j6g>, j6g> {
        public static final c a = new c(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, Object obj) {
            a.c(pm8Var).setUpdateBlock((Function1) obj);
            return j6g.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class d<T> extends mj8 implements Function2<pm8, Function1<? super T, ? extends j6g>, j6g> {
        public static final d a = new d(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, Object obj) {
            a.c(pm8Var).setReleaseBlock((Function1) obj);
            return j6g.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class e<T> extends mj8 implements Function2<pm8, Function1<? super T, ? extends j6g>, j6g> {
        public static final e a = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, Object obj) {
            a.c(pm8Var).setUpdateBlock((Function1) obj);
            return j6g.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class f<T> extends mj8 implements Function2<pm8, Function1<? super T, ? extends j6g>, j6g> {
        public static final f a = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, Object obj) {
            a.c(pm8Var).setReleaseBlock((Function1) obj);
            return j6g.a;
        }
    }

    public static final class g extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ Function1<Context, T> $factory;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Function1<T, j6g> $onRelease;
        final /* synthetic */ Function1<T, j6g> $onReset;
        final /* synthetic */ Function1<T, j6g> $update;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Function1<? super Context, ? extends T> function1, androidx.compose.ui.e eVar, Function1<? super T, j6g> function12, Function1<? super T, j6g> function13, Function1<? super T, j6g> function14, int i, int i2) {
            super(2);
            this.$factory = function1;
            this.$modifier = eVar;
            this.$onReset = function12;
            this.$onRelease = function13;
            this.$update = function14;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            a.b(this.$factory, this.$modifier, this.$onReset, this.$onRelease, this.$update, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class h extends mj8 implements Function1<View, j6g> {
        public static final h a = new h(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ j6g invoke(View view) {
            return j6g.a;
        }
    }

    public static final class i extends mj8 implements gu5<pm8> {
        final /* synthetic */ int $compositeKeyHash;
        final /* synthetic */ Context $context;
        final /* synthetic */ Function1<Context, T> $factory;
        final /* synthetic */ View $ownerView;
        final /* synthetic */ dm2 $parentReference;
        final /* synthetic */ ikd $stateRegistry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Context context, Function1<? super Context, ? extends T> function1, dm2 dm2Var, ikd ikdVar, int i, View view) {
            super(0);
            this.$context = context;
            this.$factory = function1;
            this.$parentReference = dm2Var;
            this.$stateRegistry = ikdVar;
            this.$compositeKeyHash = i;
            this.$ownerView = view;
        }

        @Override // defpackage.gu5
        public final pm8 invoke() {
            Context context = this.$context;
            Function1<Context, T> function1 = this.$factory;
            dm2 dm2Var = this.$parentReference;
            ikd ikdVar = this.$stateRegistry;
            int i = this.$compositeKeyHash;
            KeyEvent.Callback callback = this.$ownerView;
            callback.getClass();
            return new ypg(context, function1, dm2Var, ikdVar, i, (rxa) callback).getLayoutNode();
        }
    }

    public static final class j extends mj8 implements Function2<pm8, androidx.compose.ui.e, j6g> {
        public static final j a = new j(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, androidx.compose.ui.e eVar) {
            a.c(pm8Var).setModifier(eVar);
            return j6g.a;
        }
    }

    public static final class k extends mj8 implements Function2<pm8, iy3, j6g> {
        public static final k a = new k(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, iy3 iy3Var) {
            a.c(pm8Var).setDensity(iy3Var);
            return j6g.a;
        }
    }

    public static final class l extends mj8 implements Function2<pm8, zv8, j6g> {
        public static final l a = new l(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, zv8 zv8Var) {
            a.c(pm8Var).setLifecycleOwner(zv8Var);
            return j6g.a;
        }
    }

    public static final class m extends mj8 implements Function2<pm8, dld, j6g> {
        public static final m a = new m(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, dld dldVar) {
            a.c(pm8Var).setSavedStateRegistryOwner(dldVar);
            return j6g.a;
        }
    }

    public static final class n extends mj8 implements Function2<pm8, vl8, j6g> {
        public static final n a = new n(2);

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(pm8 pm8Var, vl8 vl8Var) {
            int i;
            ypg ypgVarC = a.c(pm8Var);
            int iOrdinal = vl8Var.ordinal();
            if (iOrdinal != 0) {
                i = 1;
                if (iOrdinal != 1) {
                    defpackage.l.g();
                    return null;
                }
            } else {
                i = 0;
            }
            ypgVarC.setLayoutDirection(i);
            return j6g.a;
        }
    }

    public static final <T extends View> void a(Function1<? super Context, ? extends T> function1, androidx.compose.ui.e eVar, Function1<? super T, j6g> function12, androidx.compose.runtime.b bVar, int i2, int i3) {
        int i4;
        Function1<? super Context, ? extends T> function13;
        Function1<? super T, j6g> function14;
        androidx.compose.ui.e eVar2;
        androidx.compose.runtime.c cVarH = bVar.h(-1783766393);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (cVarH.x(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= cVarH.K(eVar) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= cVarH.x(function12) ? IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER : IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        }
        if (cVarH.o(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                eVar = e.a.b;
            }
            androidx.compose.ui.e eVar3 = eVar;
            h hVar = a;
            Function1<? super T, j6g> function15 = i6 != 0 ? hVar : function12;
            function13 = function1;
            b(function13, eVar3, null, hVar, function15, cVarH, (i4 & 14) | 3072 | (i4 & 112) | (57344 & (i4 << 6)), 4);
            eVar2 = eVar3;
            function14 = function15;
        } else {
            function13 = function1;
            cVarH.D();
            function14 = function12;
            eVar2 = eVar;
        }
        androidx.compose.runtime.i iVarW = cVarH.W();
        if (iVarW != null) {
            iVarW.d = new C0024a(function13, eVar2, function14, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends android.view.View> void b(kotlin.jvm.functions.Function1<? super android.content.Context, ? extends T> r17, androidx.compose.ui.e r18, kotlin.jvm.functions.Function1<? super T, defpackage.j6g> r19, kotlin.jvm.functions.Function1<? super T, defpackage.j6g> r20, kotlin.jvm.functions.Function1<? super T, defpackage.j6g> r21, androidx.compose.runtime.b r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.a.b(kotlin.jvm.functions.Function1, androidx.compose.ui.e, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.b, int, int):void");
    }

    public static final ypg c(pm8 pm8Var) {
        ypg ypgVar = pm8Var.c0;
        if (ypgVar != null) {
            return ypgVar;
        }
        throw l6.k("Required value was null.");
    }

    public static final <T extends View> gu5<pm8> d(Function1<? super Context, ? extends T> function1, androidx.compose.runtime.b bVar, int i2) {
        int iHashCode = Long.hashCode(bVar.k());
        Context context = (Context) bVar.M(AndroidCompositionLocals_androidKt.b);
        c.b bVarH = bVar.H();
        ikd ikdVar = (ikd) bVar.M(kkd.a);
        View view = (View) bVar.M(AndroidCompositionLocals_androidKt.f);
        boolean zX = ((((i2 & 14) ^ 6) > 4 && bVar.K(function1)) || (i2 & 6) == 4) | bVar.x(context) | bVar.x(bVarH) | bVar.x(ikdVar) | bVar.d(iHashCode) | bVar.x(view);
        Object objV = bVar.v();
        if (zX || objV == b.a.a) {
            Object iVar = new i(context, function1, bVarH, ikdVar, iHashCode, view);
            bVar.p(iVar);
            objV = iVar;
        }
        return (gu5) objV;
    }

    public static final <T extends View> void e(androidx.compose.runtime.b bVar, androidx.compose.ui.e eVar, int i2, iy3 iy3Var, zv8 zv8Var, dld dldVar, vl8 vl8Var, sm2 sm2Var) {
        gl2.j.getClass();
        ygg.y(bVar, sm2Var, gl2.a.f);
        ygg.y(bVar, eVar, j.a);
        ygg.y(bVar, iy3Var, k.a);
        ygg.y(bVar, zv8Var, l.a);
        ygg.y(bVar, dldVar, m.a);
        ygg.y(bVar, vl8Var, n.a);
        gl2.a.C0251a c0251a = gl2.a.j;
        if (bVar.f() || !wl7.b(bVar.v(), Integer.valueOf(i2))) {
            uz.g(i2, bVar, i2, c0251a);
        }
    }
}
