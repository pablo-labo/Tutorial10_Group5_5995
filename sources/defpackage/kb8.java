package defpackage;

import android.content.Context;
import android.net.Uri;
import com.indeed.android.backendservices.common.api.ApiError;
import com.indeed.android.rnprofile.bridge.NativeTabContentManager;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kb8 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kb8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                bqe bqeVar = (bqe) obj;
                bqeVar.getClass();
                bqeVar.n(0, (String) obj3);
                bqeVar.n(1, (String) obj2);
                return j6g.a;
            case 1:
                return NativeTabContentManager.createViewInstance$lambda$1$lambda$0((NativeTabContentManager) obj3, (faa) obj2, ((Integer) obj).intValue());
            case 2:
                Function2 function2 = (Function2) obj3;
                Context context = (Context) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    function2.invoke(context, uri);
                }
                return j6g.a;
            case 3:
                ApiError apiError = (ApiError) obj3;
                psc pscVar = (psc) obj2;
                y3b y3bVar = (y3b) obj;
                y3bVar.getClass();
                y3bVar.b("error_message", apiError.getMsg());
                y3bVar.b("error_description", apiError.description());
                y3bVar.b("recent_search_keyword", pscVar.a);
                y3bVar.b("recent_search_location", pscVar.b);
                return j6g.a;
            default:
                return new h60(2, (g4a) obj3, (d3a) obj2);
        }
    }
}
