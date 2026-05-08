package defpackage;

import android.database.Cursor;
import android.widget.Filter;

/* JADX INFO: loaded from: classes.dex */
public final class q93 extends Filter {
    public f93 a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((aze) this.a).d((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            f93 r3 = r3.a
            aze r3 = (defpackage.aze) r3
            androidx.appcompat.widget.SearchView r0 = r3.Z
            if (r4 != 0) goto Lb
            java.lang.String r4 = ""
            goto Lf
        Lb:
            java.lang.String r4 = r4.toString()
        Lf:
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 != 0) goto L31
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L1d
            goto L31
        L1d:
            android.app.SearchableInfo r0 = r3.a0     // Catch: java.lang.RuntimeException -> L29
            android.database.Cursor r3 = r3.h(r0, r4)     // Catch: java.lang.RuntimeException -> L29
            if (r3 == 0) goto L31
            r3.getCount()     // Catch: java.lang.RuntimeException -> L29
            goto L32
        L29:
            r3 = move-exception
            java.lang.String r4 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions query threw an exception."
            android.util.Log.w(r4, r0, r3)
        L31:
            r3 = r2
        L32:
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            if (r3 == 0) goto L42
            int r0 = r3.getCount()
            r4.count = r0
            r4.values = r3
            goto L47
        L42:
            r3 = 0
            r4.count = r3
            r4.values = r2
        L47:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q93.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        f93 f93Var = this.a;
        Cursor cursor = f93Var.c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((aze) f93Var).c((Cursor) obj);
    }
}
