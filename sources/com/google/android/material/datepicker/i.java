package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.b;
import defpackage.ira;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView a;
    public final /* synthetic */ j b;

    public i(j jVar, MaterialCalendarGridView materialCalendarGridView) {
        this.b = jVar;
        this.a = materialCalendarGridView;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.a;
        h hVarA = materialCalendarGridView.a();
        if (i < hVarA.a.f() || i > hVarA.c()) {
            return;
        }
        b.c cVar = this.b.g;
        long jLongValue = materialCalendarGridView.a().getItem(i).longValue();
        b bVar = b.this;
        if (bVar.d.c.h0(jLongValue)) {
            bVar.c.L1(jLongValue);
            Iterator it = bVar.a.iterator();
            while (it.hasNext()) {
                ((ira) it.next()).b(bVar.c.E1());
            }
            bVar.X.getAdapter().a.b();
            RecyclerView recyclerView = bVar.W;
            if (recyclerView != null) {
                recyclerView.getAdapter().a.b();
            }
        }
    }
}
