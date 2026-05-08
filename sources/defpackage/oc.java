package defpackage;

import com.indeed.android.jobsearch.LaunchActivity;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oc implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ oc(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                g4aVar.setValue("");
                break;
            case 1:
                g4aVar.setValue(Boolean.FALSE);
                break;
            case 2:
                g4aVar.setValue(Boolean.TRUE);
                break;
            case 3:
                g4aVar.setValue(Boolean.FALSE);
                break;
            case 4:
                g4aVar.setValue(Boolean.FALSE);
                break;
            default:
                int i2 = LaunchActivity.e1;
                g4aVar.setValue(Boolean.FALSE);
                break;
        }
        return j6g.a;
    }
}
