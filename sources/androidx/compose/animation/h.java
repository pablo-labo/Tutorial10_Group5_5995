package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.q;
import androidx.compose.ui.layout.w;
import defpackage.ag9;
import defpackage.bg9;
import defpackage.bs4;
import defpackage.gme;
import defpackage.j6g;
import defpackage.mj8;
import defpackage.pl7;
import defpackage.ql7;
import defpackage.th7;
import defpackage.vf9;
import defpackage.vl8;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ag9 {
    public final AnimatedContentTransitionScopeImpl<?> a;

    public static final class a extends mj8 implements Function1<w.a, j6g> {
        final /* synthetic */ int $maxHeight;
        final /* synthetic */ int $maxWidth;
        final /* synthetic */ w[] $placeables;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w[] wVarArr, h hVar, int i, int i2) {
            super(1);
            this.$placeables = wVarArr;
            this.this$0 = hVar;
            this.$maxWidth = i;
            this.$maxHeight = i2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final j6g invoke(w.a aVar) {
            w.a aVar2 = aVar;
            w[] wVarArr = this.$placeables;
            h hVar = this.this$0;
            int i = this.$maxWidth;
            int i2 = this.$maxHeight;
            for (w wVar : wVarArr) {
                if (wVar != null) {
                    long jA = hVar.a.b.a((((long) wVar.a) << 32) | (((long) wVar.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), vl8.a);
                    aVar2.r(wVar, (int) (jA >> 32), (int) (jA & 4294967295L), 0.0f);
                }
            }
            return j6g.a;
        }
    }

    public h(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.a = animatedContentTransitionScopeImpl;
    }

    @Override // defpackage.ag9
    public final int a(ql7 ql7Var, List<? extends pl7> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).P(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).P(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ag9
    public final bg9 c(q qVar, List<? extends vf9> list, long j) {
        w wVar;
        int i;
        w wVar2;
        int i2;
        int i3;
        int size = list.size();
        w[] wVarArr = new w[size];
        List<? extends vf9> list2 = list;
        int size2 = list2.size();
        long j2 = 0;
        int i4 = 0;
        while (true) {
            wVar = null;
            i = 1;
            if (i4 >= size2) {
                break;
            }
            vf9 vf9Var = list.get(i4);
            Object objG = vf9Var.g();
            AnimatedContentTransitionScopeImpl.a aVar = objG instanceof AnimatedContentTransitionScopeImpl.a ? (AnimatedContentTransitionScopeImpl.a) objG : null;
            if (aVar != null && ((Boolean) ((gme) aVar.b).getValue()).booleanValue()) {
                w wVarR = vf9Var.R(j);
                long j3 = (((long) wVarR.b) & 4294967295L) | (((long) wVarR.a) << 32);
                j6g j6gVar = j6g.a;
                wVarArr[i4] = wVarR;
                j2 = j3;
            }
            i4++;
        }
        int size3 = list2.size();
        for (int i5 = 0; i5 < size3; i5++) {
            vf9 vf9Var2 = list.get(i5);
            if (wVarArr[i5] == null) {
                wVarArr[i5] = vf9Var2.R(j);
            }
        }
        if (qVar.m0()) {
            i2 = (int) (j2 >> 32);
        } else {
            if (size == 0) {
                wVar2 = null;
            } else {
                wVar2 = wVarArr[0];
                int i6 = size - 1;
                if (i6 != 0) {
                    int i7 = wVar2 != null ? wVar2.a : 0;
                    if (1 <= i6) {
                        int i8 = 1;
                        while (true) {
                            w wVar3 = wVarArr[i8];
                            int i9 = wVar3 != null ? wVar3.a : 0;
                            if (i7 < i9) {
                                wVar2 = wVar3;
                                i7 = i9;
                            }
                            if (i8 == i6) {
                                break;
                            }
                            i8++;
                        }
                    }
                }
            }
            i2 = wVar2 != null ? wVar2.a : 0;
        }
        if (qVar.m0()) {
            i3 = (int) (j2 & 4294967295L);
        } else {
            if (size != 0) {
                wVar = wVarArr[0];
                int i10 = size - 1;
                if (i10 != 0) {
                    int i11 = wVar != null ? wVar.b : 0;
                    if (1 <= i10) {
                        while (true) {
                            w wVar4 = wVarArr[i];
                            int i12 = wVar4 != null ? wVar4.b : 0;
                            if (i11 < i12) {
                                wVar = wVar4;
                                i11 = i12;
                            }
                            if (i == i10) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
            i3 = wVar != null ? wVar.b : 0;
        }
        if (!qVar.m0()) {
            ((gme) this.a.c).setValue(new th7((((long) i2) << 32) | (((long) i3) & 4294967295L)));
        }
        return qVar.Y0(i2, i3, bs4.a, new a(wVarArr, this, i2, i3));
    }

    @Override // defpackage.ag9
    public final int e(ql7 ql7Var, List<? extends pl7> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).O(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).O(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ag9
    public final int f(ql7 ql7Var, List<? extends pl7> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).w(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).w(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // defpackage.ag9
    public final int h(ql7 ql7Var, List<? extends pl7> list, int i) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).K(i));
            int i2 = 1;
            int size = list.size() - 1;
            if (1 <= size) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i2).K(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
