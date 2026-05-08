package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import defpackage.b27;
import defpackage.h8c;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.FailedToWriteExifDataToFileException;
import expo.modules.imagepicker.FailedToWriteFileException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bx implements gu5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bx(e13 e13Var, hee heeVar, Function1 function1) {
        this.a = 3;
        this.b = e13Var;
        this.c = heeVar;
        this.d = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gu5
    public final Object invoke() throws FailedToWriteFileException, FailedToReadFileException, IOException {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(new zie(null, (String) ((g4a) obj3).getValue(), null, null, false, (String) ((g4a) obj2).getValue(), null, null, null, null, 989));
                mx.b(nx.b);
                return j6g.a;
            case 1:
                qm4.b(in4.a, "Edit");
                ((g4a) obj3).setValue(null);
                ((g4a) obj2).setValue("");
                ((gu5) obj).invoke();
                return j6g.a;
            case 2:
                File file = (File) obj;
                Uri uri = (Uri) obj3;
                ContentResolver contentResolver = (ContentResolver) obj2;
                if (uri.compareTo(Uri.fromFile(file)) == 0) {
                    return j6g.a;
                }
                List listA0 = u63.a0("ImageLength", "ImageWidth", "PixelXDimension", "PixelYDimension", "Orientation");
                try {
                    InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        throw new FailedToReadFileException(ojd.k(uri), null);
                    }
                    try {
                        e25 e25Var = new e25(inputStreamOpenInputStream);
                        e25 e25Var2 = new e25(file);
                        b27.a aVar = b27.a;
                        ArrayList arrayList = new ArrayList();
                        for (Pair<? extends String, ? extends String> pair : aVar) {
                            if (!listA0.contains(pair.b())) {
                                arrayList.add(pair);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(t92.r0(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            String str = (String) ((Pair) it.next()).b();
                            arrayList2.add(new Pair(str, e25Var.c(str)));
                        }
                        ArrayList<Pair> arrayList3 = new ArrayList();
                        for (Object obj4 : arrayList2) {
                            if (((String) ((Pair) obj4).b()) != null) {
                                arrayList3.add(obj4);
                            }
                        }
                        for (Pair pair2 : arrayList3) {
                            e25Var2.H((String) pair2.a(), (String) pair2.b());
                        }
                        try {
                            e25Var2.D();
                            j6g j6gVar = j6g.a;
                            inputStreamOpenInputStream.close();
                            return j6g.a;
                        } catch (IOException e) {
                            throw new FailedToWriteExifDataToFileException("Failed to write EXIF data to file '" + Uri.fromFile(file), e);
                        }
                    } finally {
                    }
                } catch (FileNotFoundException e2) {
                    throw new FailedToWriteFileException(file, e2);
                }
            default:
                u63.Y((e13) obj3, null, null, new h8c.b((hee) obj2, (Function1) obj, null), 3);
                return j6g.a;
        }
    }

    public /* synthetic */ bx(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
