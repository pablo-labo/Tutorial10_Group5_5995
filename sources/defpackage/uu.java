package defpackage;

import com.indeed.android.rnprofile.RNProfileScreenModule;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uu implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ uu(int i, g4a g4aVar) {
        this.a = i;
        this.b = g4aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() {
        int i = this.a;
        g4a g4aVar = this.b;
        switch (i) {
            case 0:
                g4aVar.setValue(null);
                break;
            case 1:
                g4aVar.setValue(Boolean.TRUE);
                break;
            case 2:
                g4aVar.setValue(Boolean.valueOf(!((Boolean) g4aVar.getValue()).booleanValue()));
                break;
            case 3:
                RNProfileScreenModule.INSTANCE.getClass();
                g4aVar.setValue(Boolean.valueOf(RNProfileScreenModule.shouldShowTopNavResumeUploadButton));
                break;
            case 4:
                g4aVar.setValue(Boolean.FALSE);
                break;
            default:
                g4aVar.setValue(Boolean.FALSE);
                break;
        }
        return j6g.a;
    }
}
