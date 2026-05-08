package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final /* synthetic */ RecyclerView a;

    public w(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final void a(a.C0075a c0075a) {
        int i = c0075a.a;
        RecyclerView recyclerView = this.a;
        if (i == 1) {
            recyclerView.f0.U(c0075a.b, c0075a.c);
            return;
        }
        if (i == 2) {
            recyclerView.f0.X(c0075a.b, c0075a.c);
        } else if (i == 4) {
            recyclerView.f0.Y(c0075a.b, c0075a.c);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.f0.W(c0075a.b, c0075a.c);
        }
    }

    public final RecyclerView.b0 b(int i) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        int i2 = 0;
        RecyclerView.b0 b0Var = null;
        while (true) {
            if (i2 >= iH) {
                break;
            }
            RecyclerView.b0 b0VarM = RecyclerView.M(recyclerView.f.g(i2));
            if (b0VarM != null && !b0VarM.h() && b0VarM.c == i) {
                if (!recyclerView.f.c.contains(b0VarM.a)) {
                    b0Var = b0VarM;
                    break;
                }
                b0Var = b0VarM;
            }
            i2++;
        }
        if (b0Var != null) {
            if (!recyclerView.f.c.contains(b0Var.a)) {
                return b0Var;
            }
            if (RecyclerView.r1) {
                Log.d("RecyclerView", "assuming view holder cannot be find because it is hidden");
            }
        }
        return null;
    }

    public final void c(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iH; i6++) {
            View viewG = recyclerView.f.g(i6);
            RecyclerView.b0 b0VarM = RecyclerView.M(viewG);
            if (b0VarM != null && !b0VarM.o() && (i4 = b0VarM.c) >= i && i4 < i5) {
                b0VarM.a(2);
                b0VarM.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
                ((RecyclerView.n) viewG.getLayoutParams()).c = true;
            }
        }
        RecyclerView.t tVar = recyclerView.c;
        ArrayList<RecyclerView.b0> arrayList = tVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RecyclerView.b0 b0Var = arrayList.get(size);
            if (b0Var != null && (i3 = b0Var.c) >= i && i3 < i5) {
                b0Var.a(2);
                tVar.g(size);
            }
        }
        recyclerView.b1 = true;
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        for (int i3 = 0; i3 < iH; i3++) {
            RecyclerView.b0 b0VarM = RecyclerView.M(recyclerView.f.g(i3));
            if (b0VarM != null && !b0VarM.o() && b0VarM.c >= i) {
                if (RecyclerView.r1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert attached child " + i3 + " holder " + b0VarM + " now at position " + (b0VarM.c + i2));
                }
                b0VarM.l(i2, false);
                recyclerView.X0.f = true;
            }
        }
        ArrayList<RecyclerView.b0> arrayList = recyclerView.c.c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.b0 b0Var = arrayList.get(i4);
            if (b0Var != null && b0Var.c >= i) {
                if (RecyclerView.r1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForInsert cached " + i4 + " holder " + b0Var + " now at position " + (b0Var.c + i2));
                }
                b0Var.l(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.a1 = true;
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.a;
        int iH = recyclerView.f.h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iH; i11++) {
            RecyclerView.b0 b0VarM = RecyclerView.M(recyclerView.f.g(i11));
            if (b0VarM != null && (i9 = b0VarM.c) >= i4 && i9 <= i3) {
                if (RecyclerView.r1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove attached child " + i11 + " holder " + b0VarM);
                }
                if (b0VarM.c == i) {
                    b0VarM.l(i2 - i, false);
                } else {
                    b0VarM.l(i5, false);
                }
                recyclerView.X0.f = true;
            }
        }
        ArrayList<RecyclerView.b0> arrayList = recyclerView.c.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.b0 b0Var = arrayList.get(i12);
            if (b0Var != null && (i8 = b0Var.c) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    b0Var.l(i2 - i, false);
                } else {
                    b0Var.l(i10, false);
                }
                if (RecyclerView.r1) {
                    Log.d("RecyclerView", "offsetPositionRecordsForMove cached child " + i12 + " holder " + b0Var);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.a1 = true;
    }
}
