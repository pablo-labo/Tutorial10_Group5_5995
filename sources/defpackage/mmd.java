package defpackage;

import androidx.compose.runtime.b;
import androidx.compose.ui.layout.w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class mmd extends mj8 implements Function2<bxe, iq2, bg9> {
    final /* synthetic */ Function2<b, Integer, j6g> $bottomBar;
    final /* synthetic */ wu5<gza, b, Integer, j6g> $content;
    final /* synthetic */ mzg $contentWindowInsets;
    final /* synthetic */ Function2<b, Integer, j6g> $fab;
    final /* synthetic */ int $fabPosition;
    final /* synthetic */ Function2<b, Integer, j6g> $snackbar;
    final /* synthetic */ Function2<b, Integer, j6g> $topBar;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mmd(Function2<? super b, ? super Integer, j6g> function2, Function2<? super b, ? super Integer, j6g> function22, Function2<? super b, ? super Integer, j6g> function23, int i, mzg mzgVar, Function2<? super b, ? super Integer, j6g> function24, wu5<? super gza, ? super b, ? super Integer, j6g> wu5Var) {
        super(2);
        this.$topBar = function2;
        this.$snackbar = function22;
        this.$fab = function23;
        this.$fabPosition = i;
        this.$contentWindowInsets = mzgVar;
        this.$bottomBar = function24;
        this.$content = wu5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final bg9 invoke(bxe bxeVar, iq2 iq2Var) {
        Object obj;
        Object obj2;
        Object obj3;
        t55 t55Var;
        Object obj4;
        Integer numValueOf;
        int i;
        int i2;
        int iX0;
        int iC;
        Object obj5;
        Object obj6;
        int iX02;
        int iX03;
        bxe bxeVar2 = bxeVar;
        long j = iq2Var.a;
        int iH = iq2.h(j);
        int iG = iq2.g(j);
        long jA = iq2.a(0, 0, 0, 0, 10, j);
        List<vf9> listF = bxeVar2.F(qmd.a, this.$topBar);
        ArrayList arrayList = new ArrayList(listF.size());
        int size = listF.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(listF.get(i3).R(jA));
        }
        int i4 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i5 = ((w) obj).b;
            int size2 = arrayList.size() - 1;
            if (1 <= size2) {
                int i6 = 1;
                while (true) {
                    Object obj7 = arrayList.get(i6);
                    int i7 = ((w) obj7).b;
                    if (i5 < i7) {
                        obj = obj7;
                        i5 = i7;
                    }
                    if (i6 == size2) {
                        break;
                    }
                    i6++;
                }
            }
        }
        w wVar = (w) obj;
        int i8 = wVar != null ? wVar.b : 0;
        List<vf9> listF2 = bxeVar2.F(qmd.c, this.$snackbar);
        mzg mzgVar = this.$contentWindowInsets;
        ArrayList arrayList2 = new ArrayList(listF2.size());
        int size3 = listF2.size();
        int i9 = 0;
        while (i9 < size3) {
            arrayList2.add(listF2.get(i9).R(mq2.i((-mzgVar.d(bxeVar2, bxeVar2.getLayoutDirection())) - mzgVar.b(bxeVar2, bxeVar2.getLayoutDirection()), -mzgVar.c(bxeVar2), jA)));
            i9++;
            i4 = i4;
            listF2 = listF2;
        }
        int i10 = i4;
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int i11 = ((w) obj2).b;
            int size4 = arrayList2.size() - 1;
            if (i10 <= size4) {
                Object obj8 = obj2;
                int i12 = i11;
                int i13 = 1;
                while (true) {
                    Object obj9 = arrayList2.get(i13);
                    int i14 = ((w) obj9).b;
                    if (i12 < i14) {
                        obj8 = obj9;
                        i12 = i14;
                    }
                    if (i13 == size4) {
                        break;
                    }
                    i13++;
                }
                obj2 = obj8;
            }
        }
        w wVar2 = (w) obj2;
        int i15 = wVar2 != null ? wVar2.b : 0;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int i16 = ((w) obj3).a;
            int size5 = arrayList2.size() - 1;
            if (1 <= size5) {
                Object obj10 = obj3;
                int i17 = i16;
                int i18 = 1;
                while (true) {
                    Object obj11 = arrayList2.get(i18);
                    int i19 = ((w) obj11).a;
                    if (i17 < i19) {
                        obj10 = obj11;
                        i17 = i19;
                    }
                    if (i18 == size5) {
                        break;
                    }
                    i18++;
                }
                obj3 = obj10;
            }
        }
        w wVar3 = (w) obj3;
        int i20 = wVar3 != null ? wVar3.a : 0;
        List<vf9> listF3 = bxeVar2.F(qmd.d, this.$fab);
        mzg mzgVar2 = this.$contentWindowInsets;
        int i21 = i20;
        ArrayList arrayList3 = new ArrayList(listF3.size());
        int size6 = listF3.size();
        int i22 = 0;
        while (i22 < size6) {
            int i23 = i15;
            ArrayList arrayList4 = arrayList;
            List<vf9> list = listF3;
            int i24 = i8;
            w wVarR = listF3.get(i22).R(mq2.i((-mzgVar2.d(bxeVar2, bxeVar2.getLayoutDirection())) - mzgVar2.b(bxeVar2, bxeVar2.getLayoutDirection()), -mzgVar2.c(bxeVar2), jA));
            if (wVarR.b == 0 || wVarR.a == 0) {
                wVarR = null;
            }
            if (wVarR != null) {
                arrayList3.add(wVarR);
            }
            i22++;
            arrayList = arrayList4;
            i15 = i23;
            listF3 = list;
            i8 = i24;
        }
        int i25 = i15;
        ArrayList arrayList5 = arrayList;
        int i26 = i8;
        if (arrayList3.isEmpty()) {
            t55Var = null;
        } else {
            if (arrayList3.isEmpty()) {
                obj5 = null;
            } else {
                obj5 = arrayList3.get(0);
                int i27 = ((w) obj5).a;
                int size7 = arrayList3.size() - 1;
                if (1 <= size7) {
                    Object obj12 = obj5;
                    int i28 = i27;
                    int i29 = 1;
                    while (true) {
                        Object obj13 = arrayList3.get(i29);
                        int i30 = ((w) obj13).a;
                        if (i28 < i30) {
                            i28 = i30;
                            obj12 = obj13;
                        }
                        if (i29 == size7) {
                            break;
                        }
                        i29++;
                    }
                    obj5 = obj12;
                }
            }
            obj5.getClass();
            int i31 = ((w) obj5).a;
            if (arrayList3.isEmpty()) {
                obj6 = null;
            } else {
                obj6 = arrayList3.get(0);
                int i32 = ((w) obj6).b;
                int size8 = arrayList3.size() - 1;
                if (1 <= size8) {
                    Object obj14 = obj6;
                    int i33 = i32;
                    int i34 = 1;
                    while (true) {
                        Object obj15 = arrayList3.get(i34);
                        int i35 = ((w) obj15).b;
                        if (i33 < i35) {
                            i33 = i35;
                            obj14 = obj15;
                        }
                        if (i34 == size8) {
                            break;
                        }
                        i34++;
                    }
                    obj6 = obj14;
                }
            }
            obj6.getClass();
            int i36 = ((w) obj6).b;
            int i37 = this.$fabPosition;
            vl8 vl8Var = vl8.a;
            if (i37 != 0) {
                if (i37 != 2 && i37 != 3) {
                    iX02 = (iH - i31) / 2;
                } else if (bxeVar2.getLayoutDirection() == vl8Var) {
                    iX03 = bxeVar2.x0(16.0f);
                    iX02 = (iH - iX03) - i31;
                } else {
                    iX02 = bxeVar2.x0(16.0f);
                }
                t55Var = new t55(iX02, i36);
            } else if (bxeVar2.getLayoutDirection() == vl8Var) {
                iX02 = bxeVar2.x0(16.0f);
                t55Var = new t55(iX02, i36);
            } else {
                iX03 = bxeVar2.x0(16.0f);
                iX02 = (iH - iX03) - i31;
                t55Var = new t55(iX02, i36);
            }
        }
        List<vf9> listF4 = bxeVar2.F(qmd.e, new ah2(-2146438447, new kmd(this.$bottomBar), true));
        ArrayList arrayList6 = new ArrayList(listF4.size());
        int size9 = listF4.size();
        for (int i38 = 0; i38 < size9; i38++) {
            arrayList6.add(listF4.get(i38).R(jA));
        }
        if (arrayList6.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList6.get(0);
            int i39 = ((w) obj4).b;
            int size10 = arrayList6.size() - 1;
            if (1 <= size10) {
                int i40 = 1;
                while (true) {
                    Object obj16 = arrayList6.get(i40);
                    int i41 = ((w) obj16).b;
                    if (i39 < i41) {
                        i39 = i41;
                        obj4 = obj16;
                    }
                    if (i40 == size10) {
                        break;
                    }
                    i40++;
                }
            }
        }
        w wVar4 = (w) obj4;
        Integer numValueOf2 = wVar4 != null ? Integer.valueOf(wVar4.b) : null;
        if (t55Var != null) {
            int i42 = t55Var.b;
            int i43 = this.$fabPosition;
            mzg mzgVar3 = this.$contentWindowInsets;
            if (numValueOf2 == null || i43 == 3) {
                iX0 = bxeVar2.x0(16.0f) + i42;
                iC = mzgVar3.c(bxeVar2);
            } else {
                iX0 = numValueOf2.intValue() + i42;
                iC = bxeVar2.x0(16.0f);
            }
            numValueOf = Integer.valueOf(iC + iX0);
        } else {
            numValueOf = null;
        }
        if (i25 != 0) {
            int iIntValue = i25 + (numValueOf != null ? numValueOf.intValue() : numValueOf2 != null ? numValueOf2.intValue() : this.$contentWindowInsets.c(bxeVar2));
            i = iH;
            i2 = iIntValue;
        } else {
            i = iH;
            i2 = 0;
        }
        t55 t55Var2 = t55Var;
        List<vf9> listF5 = bxeVar2.F(qmd.b, new ah2(-1213360416, new imd(this.$contentWindowInsets, bxeVar2, arrayList5, i26, arrayList6, numValueOf2, this.$content), true));
        ArrayList arrayList7 = new ArrayList(listF5.size());
        int size11 = listF5.size();
        int i44 = 0;
        while (i44 < size11) {
            arrayList7.add(listF5.get(i44).R(jA));
            i44++;
            listF5 = listF5;
        }
        int i45 = i;
        return bxeVar2.Y0(i45, iG, bs4.a, new hmd(arrayList7, arrayList5, arrayList2, arrayList6, t55Var2, i45, i21, this.$contentWindowInsets, bxeVar2, iG, i2, numValueOf2, arrayList3, numValueOf));
    }
}
