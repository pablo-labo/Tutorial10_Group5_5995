package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.backendservices.common.api.a;
import com.indeed.android.jobsearch.R;
import com.indeed.android.jobsearch.backend.tasks.NewJobsCountResponse;
import com.wlappdebug.r;
import defpackage.wg0;
import defpackage.xh8;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.SerializationException;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public final class osc implements RemoteViewsService.RemoteViewsFactory, xh8 {
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;

    public static final class a extends mj8 implements gu5<gz4> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(osc oscVar) {
            super(0);
            this.$this_inject = oscVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [gz4, java.lang.Object] */
        @Override // defpackage.gu5
        public final gz4 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(gz4.class), a9cVar);
        }
    }

    public static final class b extends mj8 implements gu5<p87> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(osc oscVar) {
            super(0);
            this.$this_inject = oscVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p87] */
        @Override // defpackage.gu5
        public final p87 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(p87.class), a9cVar);
        }
    }

    public static final class c extends mj8 implements gu5<r.b> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(osc oscVar) {
            super(0);
            this.$this_inject = oscVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [com.wlappdebug.r$b, java.lang.Object] */
        @Override // defpackage.gu5
        public final r.b invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(r.b.class), a9cVar);
        }
    }

    public static final class d extends mj8 implements gu5<zk6> {
        final /* synthetic */ xh8 $this_inject;
        final /* synthetic */ a9c $qualifier = null;
        final /* synthetic */ gu5 $parameters = null;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(osc oscVar) {
            super(0);
            this.$this_inject = oscVar;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zk6] */
        @Override // defpackage.gu5
        public final zk6 invoke() {
            xh8 xh8Var = this.$this_inject;
            a9c a9cVar = this.$qualifier;
            return (xh8Var instanceof ai8 ? ((ai8) xh8Var).d() : (qpd) xh8Var.getKoin().a.b).a(this.$parameters, fwc.a.b(zk6.class), a9cVar);
        }
    }

    public osc(Context context) {
        this.a = context;
        a aVar = new a(this);
        qt8 qt8Var = qt8.a;
        this.c = boa.E(qt8Var, aVar);
        this.d = boa.E(qt8Var, new b(this));
        this.e = boa.E(qt8Var, new c(this));
        this.f = boa.E(qt8Var, new d(this));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return i;
    }

    @Override // defpackage.xh8
    public final vh8 getKoin() {
        return xh8.a.a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return new RemoteViews(this.a.getPackageName(), R.layout.view_recent_search_app_widget_loading);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(final int i) {
        r.b bVar = (r.b) this.e.getValue();
        bVar.getClass();
        r.a aVar = (r.a) r.a.get("appWidget.itemProvideDelay");
        if (aVar != null) {
            bVar.a(aVar);
        }
        try {
            RemoteViews remoteViews = new RemoteViews(this.a.getPackageName(), R.layout.view_recent_search_app_widget_item);
            msc mscVar = (msc) this.b.get(i);
            mscVar.getClass();
            String str = mscVar.c;
            String str2 = mscVar.b;
            if (zve.U(str2)) {
                remoteViews.setViewVisibility(R.id.recent_search_app_widget_main_text, 8);
            } else {
                remoteViews.setTextViewText(R.id.recent_search_app_widget_main_text, str2);
                remoteViews.setViewVisibility(R.id.recent_search_app_widget_main_text, 0);
            }
            if (zve.U(str)) {
                remoteViews.setViewVisibility(R.id.recent_search_app_widget_sub_text, 8);
            } else {
                remoteViews.setTextViewText(R.id.recent_search_app_widget_sub_text, str);
                remoteViews.setViewVisibility(R.id.recent_search_app_widget_sub_text, 0);
            }
            int i2 = mscVar.a;
            boolean z = i2 > 0;
            String strValueOf = i2 > 999 ? "999+" : String.valueOf(i2);
            if (z) {
                remoteViews.setTextViewText(R.id.recent_search_app_widget_new_count, strValueOf);
                remoteViews.setViewVisibility(R.id.recent_search_app_widget_new_count, 0);
            } else {
                remoteViews.setViewVisibility(R.id.recent_search_app_widget_new_count, 8);
            }
            Intent intent = new Intent();
            intent.setFlags(268468224);
            intent.putExtra("RECENT_SEARCH_APP_WIDGET_SERP_URL", ((p87) this.d.getValue()).h() + "jobs?q=" + str2 + "&l=" + str + "&from=Android-Widget");
            intent.putExtra("RECENT_SEARCH_APP_WIDGET_SERP_KEYWORD", str2);
            intent.putExtra("RECENT_SEARCH_APP_WIDGET_SERP_LOCATION", str);
            intent.setAction("recent_search_app_widget_action");
            remoteViews.setOnClickFillInIntent(R.id.recent_search_app_widget_item_small, intent);
            return remoteViews;
        } catch (IndexOutOfBoundsException e) {
            ((gz4) this.c.getValue()).a("app_widget_list_out_of_bound_exception", new Function1() { // from class: nsc
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    y3b y3bVar = (y3b) obj;
                    y3bVar.getClass();
                    y3bVar.b("exception", e.toString());
                    y3bVar.b("app_widget_type", "recent_search");
                    y3bVar.b("items_list_length", String.valueOf(this.b.size()));
                    y3bVar.b("position_on_demand", String.valueOf(i));
                    return j6g.a;
                }
            });
            return null;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        long jLongValue;
        Lazy lazy = this.c;
        bu8 bu8Var = bu8.a;
        bu8Var.getClass();
        cu8 cu8Var = bu8.j0;
        qf8<Object>[] qf8VarArr = bu8.b;
        String str = (String) cu8Var.a(qf8VarArr[19], bu8Var);
        String str2 = (String) bu8.k0.a(qf8VarArr[20], bu8Var);
        pxc pxcVar = fz2.a;
        String strE0 = zve.e0(str);
        ArrayList<psc> arrayList = new ArrayList();
        if (!zve.U(strE0)) {
            Iterator<String> it = fz2.b.g(strE0, 0).iterator();
            while (it.hasNext()) {
                Iterator<String> it2 = fz2.c.g(it.next(), 0).iterator();
                String str3 = "";
                String str4 = "";
                while (it2.hasNext()) {
                    List<String> listG = fz2.d.g(it2.next(), 0);
                    if (listG.size() == 2) {
                        String str5 = listG.get(0);
                        String str6 = listG.get(1);
                        if (wl7.b(str5, "q")) {
                            str3 = str6;
                        }
                        if (wl7.b(str5, "l")) {
                            str4 = str6;
                        }
                    }
                }
                arrayList.add(new psc(str3, str4));
            }
        }
        pxc pxcVar2 = fz2.a;
        Iterator<String> it3 = fz2.b.g(zve.e0(str2), 0).iterator();
        while (true) {
            jLongValue = 0;
            if (!it3.hasNext()) {
                break;
            }
            List<String> listG2 = fz2.d.g(it3.next(), 0);
            if (listG2.size() == 2) {
                String str7 = listG2.get(0);
                String str8 = listG2.get(1);
                if (wl7.b(str7, "LV")) {
                    Long lC = vve.C(str8);
                    if (lC != null) {
                        jLongValue = lC.longValue();
                    }
                }
            }
        }
        long j = jLongValue;
        p87 p87Var = (p87) this.d.getValue();
        epa epaVar = epa.a;
        OkHttpClient okHttpClientB = epa.b();
        bu8 bu8Var2 = bu8.a;
        bu8Var2.getClass();
        z45 z45Var = new z45(p87Var, okHttpClientB, (String) bu8.l0.a(bu8.b[21], bu8Var2));
        ArrayList arrayList2 = this.b;
        arrayList2.clear();
        for (psc pscVar : arrayList) {
            int i = 3;
            try {
                wg0<NewJobsCountResponse> wg0VarT = z45Var.T(d93.e(), pscVar.a, pscVar.b, j, new uw(this, 10));
                if (wg0VarT instanceof wg0.b) {
                    int i2 = ((NewJobsCountResponse) ((wg0.b) wg0VarT).a).b.b;
                    String strDecode = URLDecoder.decode(pscVar.a, "UTF-8");
                    strDecode.getClass();
                    String strDecode2 = URLDecoder.decode(pscVar.b, "UTF-8");
                    strDecode2.getClass();
                    arrayList2.add(new msc(i2, strDecode, strDecode2));
                }
                if (wg0VarT instanceof wg0.a) {
                    p81 p81Var = ((wg0.a) wg0VarT).a;
                    p81Var.getClass();
                    ((gz4) lazy.getValue()).a("recent_search_app_widget_loading_error", new kb8(i, (ApiError) p81Var, pscVar));
                }
            } catch (IOException e) {
                ((gz4) lazy.getValue()).a("recent_search_app_widget_loading_error", new kb8(i, new ApiError(new a.e(), null, null, e, 6, null), pscVar));
            } catch (SerializationException e2) {
                ((gz4) lazy.getValue()).a("recent_search_app_widget_loading_error", new kb8(i, new ApiError(a.d.d, null, null, e2, 6, null), pscVar));
            }
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        this.b.clear();
    }
}
