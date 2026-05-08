package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public class oke extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void w0(RecyclerView recyclerView, int i) {
        nke nkeVar = new nke(recyclerView.getContext());
        nkeVar.a = i;
        x0(nkeVar);
    }
}
