package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import defpackage.ws2;

/* JADX INFO: loaded from: classes.dex */
public final class yj0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        ws2.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                aVar = new ws2.a(clipData, 3);
            } else {
                ws2.c cVar = new ws2.c();
                cVar.a = clipData;
                cVar.b = 3;
                aVar = cVar;
            }
            epg.j(textView, aVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        ws2.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new ws2.a(clipData, 3);
        } else {
            ws2.c cVar = new ws2.c();
            cVar.a = clipData;
            cVar.b = 3;
            aVar = cVar;
        }
        epg.j(view, aVar.build());
        return true;
    }
}
