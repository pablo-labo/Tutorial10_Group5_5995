package defpackage;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class mjb extends mj8 implements gu5<File> {
    final /* synthetic */ gu5<File> $produceFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mjb(njb njbVar) {
        super(0);
        this.$produceFile = njbVar;
    }

    @Override // defpackage.gu5
    public final File invoke() {
        File fileInvoke = this.$produceFile.invoke();
        if (hb5.Q(fileInvoke).equals("preferences_pb")) {
            return fileInvoke;
        }
        v40.o("File extension for file: ", fileInvoke, " does not match required extension for Preferences file: preferences_pb");
        return null;
    }
}
