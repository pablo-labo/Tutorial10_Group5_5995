package defpackage;

import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.vs0;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class oi0 implements ag9 {
    public final /* synthetic */ qsd a;
    public final /* synthetic */ vs0.e b;
    public final /* synthetic */ vs0.l c;
    public final /* synthetic */ int d;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ w $actionIconsPlaceable;
        final /* synthetic */ long $constraints;
        final /* synthetic */ int $layoutHeight;
        final /* synthetic */ w $navigationIconPlaceable;
        final /* synthetic */ q $this_Layout;
        final /* synthetic */ int $titleBaseline;
        final /* synthetic */ int $titleBottomPadding;
        final /* synthetic */ vs0.e $titleHorizontalArrangement;
        final /* synthetic */ w $titlePlaceable;
        final /* synthetic */ vs0.l $titleVerticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w wVar, int i, w wVar2, vs0.e eVar, long j, w wVar3, q qVar, vs0.l lVar, int i2, int i3) {
            super(1);
            this.$navigationIconPlaceable = wVar;
            this.$layoutHeight = i;
            this.$titlePlaceable = wVar2;
            this.$titleHorizontalArrangement = eVar;
            this.$constraints = j;
            this.$actionIconsPlaceable = wVar3;
            this.$this_Layout = qVar;
            this.$titleVerticalArrangement = lVar;
            this.$titleBottomPadding = i2;
            this.$titleBaseline = i3;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            int iH;
            w.a aVar2 = aVar;
            w wVar = this.$navigationIconPlaceable;
            int iMax = 0;
            w.a.y(aVar2, wVar, 0, (this.$layoutHeight - wVar.b) / 2);
            w wVar2 = this.$titlePlaceable;
            vs0.e eVar = this.$titleHorizontalArrangement;
            vs0.c cVar = vs0.e;
            if (wl7.b(eVar, cVar)) {
                int iH2 = iq2.h(this.$constraints);
                int i = this.$titlePlaceable.a;
                iH = (iH2 - i) / 2;
                int i2 = this.$navigationIconPlaceable.a;
                if (iH < i2) {
                    iH += i2 - iH;
                } else if (i + iH > iq2.h(this.$constraints) - this.$actionIconsPlaceable.a) {
                    iH += (iq2.h(this.$constraints) - this.$actionIconsPlaceable.a) - (this.$titlePlaceable.a + iH);
                }
            } else {
                iH = wl7.b(eVar, vs0.b) ? (iq2.h(this.$constraints) - this.$titlePlaceable.a) - this.$actionIconsPlaceable.a : Math.max(this.$this_Layout.x0(qi0.b), this.$navigationIconPlaceable.a);
            }
            vs0.l lVar = this.$titleVerticalArrangement;
            if (wl7.b(lVar, cVar)) {
                iMax = (this.$layoutHeight - this.$titlePlaceable.b) / 2;
            } else if (wl7.b(lVar, vs0.d)) {
                int i3 = this.$titleBottomPadding;
                if (i3 == 0) {
                    iMax = this.$layoutHeight - this.$titlePlaceable.b;
                } else {
                    int i4 = this.$titlePlaceable.b;
                    int iG = i3 - (i4 - this.$titleBaseline);
                    int i5 = i4 + iG;
                    if (i5 > iq2.g(this.$constraints)) {
                        iG -= i5 - iq2.g(this.$constraints);
                    }
                    iMax = (this.$layoutHeight - this.$titlePlaceable.b) - Math.max(0, iG);
                }
            }
            w.a.y(aVar2, wVar2, iH, iMax);
            w wVar3 = this.$actionIconsPlaceable;
            int iH3 = iq2.h(this.$constraints);
            w wVar4 = this.$actionIconsPlaceable;
            w.a.y(aVar2, wVar3, iH3 - wVar4.a, (this.$layoutHeight - wVar4.b) / 2);
            return j6g.a;
        }
    }

    public oi0(qsd qsdVar, vs0.e eVar, vs0.l lVar, int i) {
        this.a = qsdVar;
        this.b = eVar;
        this.c = lVar;
        this.d = i;
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        int iH;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vf9 vf9Var = list.get(i);
            if (wl7.b(h.a(vf9Var), "navigationIcon")) {
                w wVarR = vf9Var.R(iq2.a(0, 0, 0, 0, 14, j));
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    vf9 vf9Var2 = list.get(i2);
                    if (wl7.b(h.a(vf9Var2), "actionIcons")) {
                        w wVarR2 = vf9Var2.R(iq2.a(0, 0, 0, 0, 14, j));
                        if (iq2.h(j) == Integer.MAX_VALUE) {
                            iH = iq2.h(j);
                        } else {
                            iH = (iq2.h(j) - wVarR.a) - wVarR2.a;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i3 = iH;
                        int size3 = list.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            vf9 vf9Var3 = list.get(i4);
                            if (wl7.b(h.a(vf9Var3), "title")) {
                                w wVarR3 = vf9Var3.R(iq2.a(0, i3, 0, 0, 12, j));
                                tj6 tj6Var = e20.b;
                                int iV = wVarR3.V(tj6Var) != Integer.MIN_VALUE ? wVarR3.V(tj6Var) : 0;
                                this.a.getClass();
                                int iG = iq2.g(j) == Integer.MAX_VALUE ? iq2.g(j) : iq2.g(j) + (Float.isNaN(0.0f) ? 0 : gf9.b(0.0f));
                                return qVar.Y0(iq2.h(j), iG, bs4.a, new a(wVarR, iG, wVarR3, this.b, j, wVarR2, qVar, this.c, this.d, iV));
                            }
                            i4++;
                            i3 = i3;
                            wVarR2 = wVarR2;
                        }
                        s6.j("Collection contains no element matching the predicate.");
                        return null;
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
