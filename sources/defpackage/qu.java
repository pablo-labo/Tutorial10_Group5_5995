package defpackage;

import defpackage.sp7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qu implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4a b;

    public /* synthetic */ qu(int i, g4a g4aVar) {
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
                g4aVar.setValue("");
                break;
            case 1:
                g4aVar.setValue(Boolean.TRUE);
                break;
            case 2:
                g4aVar.setValue(Boolean.TRUE);
                break;
            case 3:
                g4aVar.setValue(kre.b);
                break;
            case 4:
                g4aVar.setValue(Boolean.FALSE);
                break;
            default:
                ((tp7) cr8.p(tp7.class)).b(new sp7.g("ResumePreviewFragment", "preview-container", null, null, 12));
                g4aVar.setValue(Boolean.valueOf(!((Boolean) g4aVar.getValue()).booleanValue()));
                break;
        }
        return j6g.a;
    }
}
