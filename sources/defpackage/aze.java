package defpackage;

import android.R;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import defpackage.f93;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class aze extends i5d implements View.OnClickListener {
    public static final /* synthetic */ int m0 = 0;
    public final SearchView Z;
    public final SearchableInfo a0;
    public final Context b0;
    public final WeakHashMap<String, Drawable.ConstantState> c0;
    public final int d0;
    public int e0;
    public ColorStateList f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;

    public static final class a {
        public final TextView a;
        public final TextView b;
        public final ImageView c;
        public final ImageView d;
        public final ImageView e;

        public a(View view) {
            this.a = (TextView) view.findViewById(R.id.text1);
            this.b = (TextView) view.findViewById(R.id.text2);
            this.c = (ImageView) view.findViewById(R.id.icon1);
            this.d = (ImageView) view.findViewById(R.id.icon2);
            this.e = (ImageView) view.findViewById(com.indeed.android.jobsearch.R.id.edit_query);
        }
    }

    public aze(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.b = true;
        this.c = null;
        this.a = false;
        this.d = -1;
        this.e = new f93.a(this);
        this.f = new f93.b(this);
        this.X = suggestionRowLayout;
        this.W = suggestionRowLayout;
        this.Y = (LayoutInflater) context.getSystemService("layout_inflater");
        this.e0 = 1;
        this.g0 = -1;
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.Z = searchView;
        this.a0 = searchableInfo;
        this.d0 = searchView.getSuggestionCommitIconResId();
        this.b0 = context;
        this.c0 = weakHashMap;
    }

    public static String i(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    @Override // defpackage.f93
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aze.b(android.view.View, android.database.Cursor):void");
    }

    @Override // defpackage.f93
    public final void c(Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.g0 = cursor.getColumnIndex("suggest_text_1");
                this.h0 = cursor.getColumnIndex("suggest_text_2");
                this.i0 = cursor.getColumnIndex("suggest_text_2_url");
                this.j0 = cursor.getColumnIndex("suggest_icon_1");
                this.k0 = cursor.getColumnIndex("suggest_icon_2");
                this.l0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // defpackage.f93
    public final String d(Cursor cursor) {
        String strI;
        String strI2;
        if (cursor == null) {
            return null;
        }
        String strI3 = i(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strI3 != null) {
            return strI3;
        }
        SearchableInfo searchableInfo = this.a0;
        if (searchableInfo.shouldRewriteQueryFromData() && (strI2 = i(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strI2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strI = i(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strI;
    }

    @Override // defpackage.f93
    public final View e(ViewGroup viewGroup) {
        View viewInflate = this.Y.inflate(this.W, viewGroup, false);
        viewInflate.setTag(new a(viewInflate));
        ((ImageView) viewInflate.findViewById(com.indeed.android.jobsearch.R.id.edit_query)).setImageResource(this.d0);
        return viewInflate;
    }

    public final Drawable f(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(p6.d(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.b0.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(p6.d(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(p6.d(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(p6.d(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(p6.d(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(p6.d(uri, "No package found for authority: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable g(java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aze.g(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // defpackage.f93, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewInflate = this.Y.inflate(this.X, viewGroup, false);
            if (viewInflate != null) {
                ((a) viewInflate.getTag()).a.setText(e.toString());
            }
            return viewInflate;
        }
    }

    @Override // defpackage.f93, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View viewE = this.e(viewGroup);
            ((a) viewE.getTag()).a.setText(e.toString());
            return viewE;
        }
    }

    public final Cursor h(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.b0.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.Z.p((CharSequence) tag);
        }
    }
}
