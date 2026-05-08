package defpackage;

import java.io.File;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ehe extends mj8 implements gu5<File> {
    final /* synthetic */ yge<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehe(yge<Object> ygeVar) {
        super(0);
        this.this$0 = ygeVar;
    }

    @Override // defpackage.gu5
    public final File invoke() {
        File file = (File) this.this$0.a.invoke();
        String absolutePath = file.getAbsolutePath();
        synchronized (yge.Z) {
            LinkedHashSet linkedHashSet = yge.Y;
            if (linkedHashSet.contains(absolutePath)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            absolutePath.getClass();
            linkedHashSet.add(absolutePath);
        }
        return file;
    }
}
