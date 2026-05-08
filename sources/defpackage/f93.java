package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public abstract class f93 extends BaseAdapter implements Filterable {
    public q93 V;
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public a e;
    public b f;

    public class a extends ContentObserver {
        public final /* synthetic */ aze a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(aze azeVar) {
            super(new Handler());
            this.a = azeVar;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            aze azeVar = this.a;
            if (!azeVar.b || (cursor = azeVar.c) == null || cursor.isClosed()) {
                return;
            }
            azeVar.a = azeVar.c.requery();
        }
    }

    public class b extends DataSetObserver {
        public final /* synthetic */ aze a;

        public b(aze azeVar) {
            this.a = azeVar;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            aze azeVar = this.a;
            azeVar.a = true;
            azeVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            aze azeVar = this.a;
            azeVar.a = false;
            azeVar.notifyDataSetInvalidated();
        }
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                a aVar2 = this.e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            i5d i5dVar = (i5d) this;
            view = i5dVar.Y.inflate(i5dVar.X, viewGroup, false);
        }
        b(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.V == null) {
            q93 q93Var = new q93();
            q93Var.a = this;
            this.V = q93Var;
        }
        return this.V;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            r6.g("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.c.moveToPosition(i)) {
            r6.g(p6.c(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            view = e(viewGroup);
        }
        b(view, this.c);
        return view;
    }
}
