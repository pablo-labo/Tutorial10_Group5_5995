package defpackage;

import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i81 {

    public static final class a extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ wu5<fhd, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ fhd $this_Row = ghd.a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wu5 wu5Var) {
            super(2);
            this.$content = wu5Var;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            androidx.compose.runtime.b bVar2 = bVar;
            if ((num.intValue() & 3) == 2 && bVar2.i()) {
                bVar2.D();
            } else {
                this.$content.q(this.$this_Row, bVar2, 0);
            }
            return j6g.a;
        }
    }

    public static final class b extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ long $containerColor;
        final /* synthetic */ wu5<fhd, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ long $contentColor;
        final /* synthetic */ androidx.compose.ui.e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.ui.e eVar, long j, long j2, wu5<? super fhd, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, int i, int i2) {
            super(2);
            this.$modifier = eVar;
            this.$containerColor = j;
            this.$contentColor = j2;
            this.$content = wu5Var;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            i81.a(this.$modifier, this.$containerColor, this.$contentColor, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    public static final class c extends mj8 implements Function1<sl8, j6g> {
        final /* synthetic */ x2a $greatGrandParentAbsoluteRight$delegate;
        final /* synthetic */ x2a $greatGrandParentAbsoluteTop$delegate;
        final /* synthetic */ x2a $layoutAbsoluteLeft$delegate;
        final /* synthetic */ x2a $layoutAbsoluteTop$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x2a x2aVar, x2a x2aVar2, x2a x2aVar3, x2a x2aVar4) {
            super(1);
            this.$layoutAbsoluteLeft$delegate = x2aVar;
            this.$layoutAbsoluteTop$delegate = x2aVar2;
            this.$greatGrandParentAbsoluteRight$delegate = x2aVar3;
            this.$greatGrandParentAbsoluteTop$delegate = x2aVar4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(sl8 sl8Var) {
            sl8 sl8VarU;
            sl8 sl8Var2 = sl8Var;
            qtc qtcVarH = ojh.h(sl8Var2);
            this.$layoutAbsoluteLeft$delegate.q(qtcVarH.a);
            this.$layoutAbsoluteTop$delegate.q(qtcVarH.b);
            sl8 sl8VarU2 = sl8Var2.U();
            sl8 sl8VarY = (sl8VarU2 == null || (sl8VarU = sl8VarU2.U()) == null) ? null : sl8VarU.y();
            if (sl8VarY != null) {
                x2a x2aVar = this.$greatGrandParentAbsoluteRight$delegate;
                x2a x2aVar2 = this.$greatGrandParentAbsoluteTop$delegate;
                qtc qtcVarH2 = ojh.h(sl8VarY);
                x2aVar.q(qtcVarH2.c);
                x2aVar2.q(qtcVarH2.b);
            }
            return j6g.a;
        }
    }

    public static final class d implements ag9 {
        public final /* synthetic */ x2a a;
        public final /* synthetic */ x2a b;
        public final /* synthetic */ x2a c;
        public final /* synthetic */ x2a d;

        public static final class a extends mj8 implements Function1<w.a, j6g> {
            final /* synthetic */ w $anchorPlaceable;
            final /* synthetic */ w $badgePlaceable;
            final /* synthetic */ x2a $greatGrandParentAbsoluteRight$delegate;
            final /* synthetic */ x2a $greatGrandParentAbsoluteTop$delegate;
            final /* synthetic */ x2a $layoutAbsoluteLeft$delegate;
            final /* synthetic */ x2a $layoutAbsoluteTop$delegate;
            final /* synthetic */ q $this_Layout;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, q qVar, w wVar2, x2a x2aVar, x2a x2aVar2, x2a x2aVar3, x2a x2aVar4) {
                super(1);
                this.$badgePlaceable = wVar;
                this.$this_Layout = qVar;
                this.$anchorPlaceable = wVar2;
                this.$layoutAbsoluteTop$delegate = x2aVar;
                this.$layoutAbsoluteLeft$delegate = x2aVar2;
                this.$greatGrandParentAbsoluteRight$delegate = x2aVar3;
                this.$greatGrandParentAbsoluteTop$delegate = x2aVar4;
            }

            @Override // kotlin.jvm.functions.Function1
            public final j6g invoke(w.a aVar) {
                w.a aVar2 = aVar;
                boolean z = this.$badgePlaceable.a > this.$this_Layout.x0(6.0f);
                float f = z ? 12.0f : 6.0f;
                float f2 = z ? 14.0f : 6.0f;
                w.a.y(aVar2, this.$anchorPlaceable, 0, 0);
                int iX0 = this.$anchorPlaceable.a - this.$this_Layout.x0(f);
                int iX02 = this.$this_Layout.x0(f2) + (-this.$badgePlaceable.b);
                float fG = this.$layoutAbsoluteTop$delegate.g() + iX02;
                float fG2 = this.$greatGrandParentAbsoluteRight$delegate.g() - ((this.$layoutAbsoluteLeft$delegate.g() + iX0) + this.$badgePlaceable.a);
                float fG3 = fG - this.$greatGrandParentAbsoluteTop$delegate.g();
                if (fG2 < 0.0f) {
                    iX0 += gf9.b(fG2);
                }
                if (fG3 < 0.0f) {
                    iX02 -= gf9.b(fG3);
                }
                w.a.y(aVar2, this.$badgePlaceable, iX0, iX02);
                return j6g.a;
            }
        }

        public d(x2a x2aVar, x2a x2aVar2, x2a x2aVar3, x2a x2aVar4) {
            this.a = x2aVar;
            this.b = x2aVar2;
            this.c = x2aVar3;
            this.d = x2aVar4;
        }

        @Override // defpackage.ag9
        public final bg9 c(q qVar, List<? extends vf9> list, long j) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                vf9 vf9Var = list.get(i);
                if (wl7.b(h.a(vf9Var), "badge")) {
                    w wVarR = vf9Var.R(iq2.a(0, 0, 0, 0, 11, j));
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        vf9 vf9Var2 = list.get(i2);
                        if (wl7.b(h.a(vf9Var2), "anchor")) {
                            w wVarR2 = vf9Var2.R(j);
                            tj6 tj6Var = e20.a;
                            int iV = wVarR2.V(tj6Var);
                            tj6 tj6Var2 = e20.b;
                            return qVar.Y0(wVarR2.a, wVarR2.b, lc9.a0(new Pair(tj6Var, Integer.valueOf(iV)), new Pair(tj6Var2, Integer.valueOf(wVarR2.V(tj6Var2)))), new a(wVarR, qVar, wVarR2, this.a, this.b, this.c, this.d));
                        }
                    }
                    s6.j("Collection contains no element matching the predicate.");
                    return null;
                }
            }
            s6.j("Collection contains no element matching the predicate.");
            return null;
        }
    }

    public static final class e extends mj8 implements Function2<androidx.compose.runtime.b, Integer, j6g> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ wu5<ml1, androidx.compose.runtime.b, Integer, j6g> $badge;
        final /* synthetic */ wu5<ml1, androidx.compose.runtime.b, Integer, j6g> $content;
        final /* synthetic */ androidx.compose.ui.e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(wu5<? super ml1, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var, androidx.compose.ui.e eVar, wu5<? super ml1, ? super androidx.compose.runtime.b, ? super Integer, j6g> wu5Var2, int i, int i2) {
            super(2);
            this.$badge = wu5Var;
            this.$modifier = eVar;
            this.$content = wu5Var2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final j6g invoke(androidx.compose.runtime.b bVar, Integer num) {
            num.intValue();
            i81.b(this.$badge, this.$modifier, this.$content, bVar, ka2.L(this.$$changed | 1), this.$$default);
            return j6g.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r16, long r17, long r19, defpackage.wu5<? super defpackage.fhd, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r21, androidx.compose.runtime.b r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i81.a(androidx.compose.ui.e, long, long, wu5, androidx.compose.runtime.b, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(defpackage.wu5<? super defpackage.ml1, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r16, androidx.compose.ui.e r17, defpackage.wu5<? super defpackage.ml1, ? super androidx.compose.runtime.b, ? super java.lang.Integer, defpackage.j6g> r18, androidx.compose.runtime.b r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i81.b(wu5, androidx.compose.ui.e, wu5, androidx.compose.runtime.b, int, int):void");
    }
}
