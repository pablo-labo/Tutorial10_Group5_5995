package defpackage;

import com.indeed.android.jobsearch.webview.modal.ModalWebview;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zwg implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zwg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ModalWebview) obj).getUrl();
            default:
                ((fnf) obj).g();
                return j6g.a;
        }
    }
}
