package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@uh3(c = "com.indeed.android.jobsearch.error.ReportEmailHelperKt$getZippedEventLogFile$2", f = "ReportEmailHelper.kt", l = {}, m = "invokeSuspend")
public final class n2d extends c1f implements Function2<e13, lu2<? super File>, Object> {
    final /* synthetic */ ba5 $fileLogging;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2d(ba5 ba5Var, lu2<? super n2d> lu2Var) {
        super(2, lu2Var);
        this.$fileLogging = ba5Var;
    }

    @Override // defpackage.x81
    public final lu2<j6g> create(Object obj, lu2<?> lu2Var) {
        return new n2d(this.$fileLogging, lu2Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(e13 e13Var, lu2<? super File> lu2Var) {
        return ((n2d) create(e13Var, lu2Var)).invokeSuspend(j6g.a);
    }

    @Override // defpackage.x81
    public final Object invokeSuspend(Object obj) throws IOException {
        List listE0 = null;
        if (this.label != 0) {
            r6.g("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r7d.b(obj);
        File fileCreateTempFile = File.createTempFile("eventLogFiles_", ".zip");
        fileCreateTempFile.getClass();
        ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile), 8192));
        ba5 ba5Var = this.$fileLogging;
        try {
            zipOutputStream.setLevel(9);
            ba5Var.getClass();
            try {
                File[] fileArrListFiles = ba5Var.a.listFiles(new aa5());
                if (fileArrListFiles == null) {
                    fileArrListFiles = new File[0];
                }
                listE0 = ut0.E0(fileArrListFiles);
            } catch (Exception e) {
                ArrayList arrayList = lz2.a;
                lz2.c("FileLogging", bg.e(e, "Unexpected exception "), false, e, 4);
            }
            List<File> list = listE0;
            if (list == null) {
                list = zr4.a;
            }
            for (File file : list) {
                if (file != null) {
                    ZipEntry zipEntry = new ZipEntry(file.getName());
                    zipEntry.setTime(file.lastModified());
                    zipOutputStream.putNextEntry(zipEntry);
                    byte[] bArr = new byte[4096];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    while (true) {
                        try {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                break;
                            }
                            zipOutputStream.write(bArr, 0, i);
                            j6g j6gVar = j6g.a;
                        } finally {
                        }
                    }
                    j6g j6gVar2 = j6g.a;
                    fileInputStream.close();
                    zipOutputStream.closeEntry();
                }
            }
            j6g j6gVar3 = j6g.a;
            zipOutputStream.close();
            return fileCreateTempFile;
        } finally {
        }
    }
}
