package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.net.Uri;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.indeed.android.jobsearch.R;
import java.util.concurrent.Executor;
import kotlin.Pair;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;
import okhttp3.internal.connection.RealCall;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class buc extends LinearLayout implements AdapterView.OnItemClickListener {
    public View V;
    public boolean W;
    public final w24 a;
    public final zh3 a0;
    public final fuc b;
    public ListView c;
    public Button d;
    public TextView e;
    public ProgressBar f;

    public static final class a extends AsyncTask<nqe, Void, Void> {
        public static final MediaType b;
        public final w24 a;

        /* JADX INFO: renamed from: buc$a$a, reason: collision with other inner class name */
        public static final class C0097a {
            public static final JSONObject a(nqe nqeVar) {
                MediaType mediaType = a.b;
                return new JSONObject(lc9.a0(new Pair("file", nqeVar.getFile()), new Pair("methodName", nqeVar.getMethod()), new Pair("lineNumber", Integer.valueOf(nqeVar.a())), new Pair("column", Integer.valueOf(nqeVar.getColumn()))));
            }
        }

        static {
            MediaType mediaTypeA;
            MediaType.e.getClass();
            try {
                mediaTypeA = MediaType.Companion.a("application/json; charset=utf-8");
            } catch (IllegalArgumentException unused) {
                mediaTypeA = null;
            }
            b = mediaTypeA;
        }

        public a(w24 w24Var) {
            w24Var.getClass();
            this.a = w24Var;
        }

        @Override // android.os.AsyncTask
        public final Void doInBackground(nqe[] nqeVarArr) {
            nqe[] nqeVarArr2 = nqeVarArr;
            nqeVarArr2.getClass();
            try {
                String string = Uri.parse(this.a.m()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                string.getClass();
                OkHttpClient okHttpClient = new OkHttpClient();
                for (nqe nqeVar : nqeVarArr2) {
                    if (nqeVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String string2 = C0097a.a(nqeVar).toString();
                    string2.getClass();
                    RequestBody.Companion companion = RequestBody.INSTANCE;
                    MediaType mediaType = b;
                    companion.getClass();
                    RequestBody$Companion$toRequestBody$2 requestBody$Companion$toRequestBody$2A = RequestBody.Companion.a(string2, mediaType);
                    Request.Builder builder = new Request.Builder();
                    builder.g(string);
                    builder.e("POST", requestBody$Companion$toRequestBody$2A);
                    new RealCall(okHttpClient, builder.b(), false).b();
                }
                return null;
            } catch (Exception e) {
                s55.g("ReactNative", "Could not open stack frame", e);
                return null;
            }
        }
    }

    public static final class b extends BaseAdapter {
        public final String a;
        public final nqe[] b;

        public static final class a {
            public final TextView a;
            public final TextView b;

            public a(View view) {
                View viewFindViewById = view.findViewById(R.id.rn_frame_method);
                viewFindViewById.getClass();
                this.a = (TextView) viewFindViewById;
                View viewFindViewById2 = view.findViewById(R.id.rn_frame_file);
                viewFindViewById2.getClass();
                this.b = (TextView) viewFindViewById2;
            }
        }

        public b(String str, nqe[] nqeVarArr) {
            this.a = str;
            this.b = nqeVarArr;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return this.b.length + 1;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            if (i == 0) {
                return this.a;
            }
            return this.b[i - 1];
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            viewGroup.getClass();
            if (i == 0) {
                if (view != null) {
                    textView = (TextView) view;
                } else {
                    View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.redbox_item_title, viewGroup, false);
                    viewInflate.getClass();
                    textView = (TextView) viewInflate;
                }
                textView.setText(new pxc("\\x1b\\[[0-9;]*m").e(this.a, ""));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.redbox_item_frame, viewGroup, false);
                view.getClass();
                view.setTag(new a(view));
            }
            nqe nqeVar = this.b[i - 1];
            Object tag = view.getTag();
            tag.getClass();
            a aVar = (a) tag;
            TextView textView2 = aVar.b;
            TextView textView3 = aVar.a;
            textView3.setText(nqeVar.getMethod());
            int i2 = pqe.a;
            StringBuilder sb = new StringBuilder();
            sb.append(nqeVar.getFileName());
            int iA = nqeVar.a();
            if (iA > 0) {
                sb.append(":");
                sb.append(iA);
                int column = nqeVar.getColumn();
                if (column > 0) {
                    sb.append(":");
                    sb.append(column);
                }
            }
            textView2.setText(sb.toString());
            textView3.setTextColor(nqeVar.b() ? -5592406 : -1);
            textView2.setTextColor(nqeVar.b() ? -8355712 : -5000269);
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            return i > 0;
        }
    }

    public buc(Activity activity, w24 w24Var, fuc fucVar) {
        super(activity);
        this.a = w24Var;
        this.b = fucVar;
        this.a0 = new zh3(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        view.getClass();
        a aVar = new a(this.a);
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        nqe[] nqeVarArr = new nqe[1];
        ListView listView = this.c;
        if (listView == null) {
            wl7.g("stackView");
            throw null;
        }
        Object item = listView.getAdapter().getItem(i);
        item.getClass();
        nqeVarArr[0] = item;
        aVar.executeOnExecutor(executor, nqeVarArr);
    }
}
