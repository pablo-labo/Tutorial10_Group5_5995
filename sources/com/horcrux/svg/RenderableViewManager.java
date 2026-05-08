package com.horcrux.svg;

import android.graphics.Matrix;
import android.graphics.Path;
import android.net.Uri;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.horcrux.svg.RenderableView;
import com.horcrux.svg.VirtualViewManager;
import com.horcrux.svg.a;
import com.horcrux.svg.events.SvgLoadEvent;
import com.horcrux.svg.n;
import defpackage.agc;
import defpackage.bfc;
import defpackage.bgc;
import defpackage.c6b;
import defpackage.cgc;
import defpackage.dgc;
import defpackage.efc;
import defpackage.egc;
import defpackage.f90;
import defpackage.fgc;
import defpackage.fjf;
import defpackage.gb9;
import defpackage.gfc;
import defpackage.ggc;
import defpackage.ha0;
import defpackage.hfc;
import defpackage.hgc;
import defpackage.hh1;
import defpackage.hjf;
import defpackage.i75;
import defpackage.ieb;
import defpackage.ifc;
import defpackage.igc;
import defpackage.ijf;
import defpackage.ip4;
import defpackage.is3;
import defpackage.j75;
import defpackage.ja0;
import defpackage.jfc;
import defpackage.jgc;
import defpackage.jjf;
import defpackage.k75;
import defpackage.kfc;
import defpackage.kgc;
import defpackage.l5;
import defpackage.l75;
import defpackage.lfc;
import defpackage.lgc;
import defpackage.m5d;
import defpackage.m75;
import defpackage.mfc;
import defpackage.mw9;
import defpackage.n75;
import defpackage.nfc;
import defpackage.ob5;
import defpackage.ofc;
import defpackage.ogc;
import defpackage.p6b;
import defpackage.pb5;
import defpackage.pfc;
import defpackage.pgc;
import defpackage.qb5;
import defpackage.qfc;
import defpackage.qgc;
import defpackage.rb5;
import defpackage.rfc;
import defpackage.rgc;
import defpackage.s55;
import defpackage.sb5;
import defpackage.sfc;
import defpackage.sgc;
import defpackage.snc;
import defpackage.so9;
import defpackage.t40;
import defpackage.tb5;
import defpackage.tec;
import defpackage.tfc;
import defpackage.ufc;
import defpackage.ugc;
import defpackage.ui3;
import defpackage.vec;
import defpackage.vfc;
import defpackage.vgc;
import defpackage.wfc;
import defpackage.wgc;
import defpackage.xec;
import defpackage.xfc;
import defpackage.xgc;
import defpackage.xif;
import defpackage.yec;
import defpackage.yfc;
import defpackage.ygc;
import defpackage.zbc;
import defpackage.zfc;
import defpackage.zif;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes2.dex */
class RenderableViewManager<T extends RenderableView> extends VirtualViewManager<T> {

    public static class CircleViewManager extends RenderableViewManager<b> implements hfc<b> {
        public static final String REACT_CLASS = "RNSVGCircle";

        public CircleViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGCircle);
            ((VirtualViewManager) this).mDelegate = new gfc(this, 0);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.hfc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.hfc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.hfc
        @snc(name = "cx")
        public void setCx(b bVar, Dynamic dynamic) {
            bVar.getClass();
            bVar.a = SVGLength.b(dynamic);
            bVar.invalidate();
        }

        @Override // defpackage.hfc
        @snc(name = "cy")
        public void setCy(b bVar, Dynamic dynamic) {
            bVar.getClass();
            bVar.b = SVGLength.b(dynamic);
            bVar.invalidate();
        }

        @Override // defpackage.hfc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.hfc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.hfc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.hfc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.hfc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.hfc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.hfc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.hfc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.hfc
        @snc(name = "r")
        public void setR(b bVar, Dynamic dynamic) {
            bVar.getClass();
            bVar.c = SVGLength.b(dynamic);
            bVar.invalidate();
        }

        @Override // defpackage.hfc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hfc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }
    }

    public static class ClipPathViewManager extends GroupViewManagerAbstract<c> implements jfc<c> {
        public static final String REACT_CLASS = "RNSVGClipPath";

        public ClipPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGClipPath);
            ((VirtualViewManager) this).mDelegate = new ifc(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.jfc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.jfc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.jfc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.jfc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h) view, dynamic);
        }

        @Override // defpackage.jfc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.jfc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.jfc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.jfc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.jfc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.jfc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.jfc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.jfc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.jfc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.jfc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.jfc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }
    }

    public static class DefsViewManager extends VirtualViewManager<is3> implements lfc<is3> {
        public static final String REACT_CLASS = "RNSVGDefs";

        public DefsViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGDefs);
            ((VirtualViewManager) this).mDelegate = new kfc(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.lfc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.lfc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        @Override // defpackage.lfc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // defpackage.lfc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.lfc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.lfc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.lfc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.lfc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.lfc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.lfc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // defpackage.lfc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }
    }

    public static class EllipseViewManager extends RenderableViewManager<d> implements mfc<d> {
        public static final String REACT_CLASS = "RNSVGEllipse";

        public EllipseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGEllipse);
            ((VirtualViewManager) this).mDelegate = new ha0(this, 1);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.mfc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.mfc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.mfc
        @snc(name = "cx")
        public void setCx(d dVar, Dynamic dynamic) {
            dVar.getClass();
            dVar.a = SVGLength.b(dynamic);
            dVar.invalidate();
        }

        @Override // defpackage.mfc
        @snc(name = "cy")
        public void setCy(d dVar, Dynamic dynamic) {
            dVar.getClass();
            dVar.b = SVGLength.b(dynamic);
            dVar.invalidate();
        }

        @Override // defpackage.mfc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.mfc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.mfc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.mfc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.mfc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.mfc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.mfc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.mfc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.mfc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        @Override // defpackage.mfc
        @snc(name = "rx")
        public void setRx(d dVar, Dynamic dynamic) {
            dVar.getClass();
            dVar.c = SVGLength.b(dynamic);
            dVar.invalidate();
        }

        @Override // defpackage.mfc
        @snc(name = "ry")
        public void setRy(d dVar, Dynamic dynamic) {
            dVar.getClass();
            dVar.d = SVGLength.b(dynamic);
            dVar.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.mfc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }
    }

    public static class FeBlendManager extends FilterPrimitiveManager<i75> implements nfc<i75> {
        public static final String REACT_CLASS = "RNSVGFeBlend";

        public FeBlendManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeBlend);
            ((VirtualViewManager) this).mDelegate = new ja0(this, 1);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.nfc
        @snc(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((ob5) view, dynamic);
        }

        @Override // defpackage.nfc
        @snc(name = "in1")
        public void setIn1(i75 i75Var, String str) {
            i75Var.c = str;
            i75Var.invalidate();
        }

        @Override // defpackage.nfc
        @snc(name = "in2")
        public void setIn2(i75 i75Var, String str) {
            i75Var.d = str;
            i75Var.invalidate();
        }

        @Override // defpackage.nfc
        @snc(name = "mode")
        public void setMode(i75 i75Var, String str) {
            i75Var.getClass();
            HashMap map = qb5.b;
            if (!map.containsKey(str)) {
                l5.q(l5.l("Unknown String Value: ", str));
            } else {
                i75Var.e = (qb5) map.get(str);
                i75Var.invalidate();
            }
        }

        @Override // defpackage.nfc
        @snc(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((ob5) view, str);
        }

        @Override // defpackage.nfc
        @snc(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((ob5) view, dynamic);
        }

        @Override // defpackage.nfc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((ob5) view, dynamic);
        }

        @Override // defpackage.nfc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((ob5) view, dynamic);
        }
    }

    public static class FeColorMatrixManager extends FilterPrimitiveManager<j75> implements ofc<j75> {
        public static final String REACT_CLASS = "RNSVGFeColorMatrix";

        public FeColorMatrixManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeColorMatrix);
            ((VirtualViewManager) this).mDelegate = new ui3(this, 1);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.ofc
        @snc(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((ob5) view, dynamic);
        }

        @Override // defpackage.ofc
        @snc(name = "in1")
        public void setIn1(j75 j75Var, String str) {
            j75Var.c = str;
            j75Var.invalidate();
        }

        @Override // defpackage.ofc
        @snc(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((ob5) view, str);
        }

        @Override // defpackage.ofc
        @snc(name = "type")
        public void setType(j75 j75Var, String str) {
            j75Var.getClass();
            HashMap map = rb5.a;
            if (!map.containsKey(str)) {
                l5.q(l5.l("Unknown String Value: ", str));
            } else {
                j75Var.d = (rb5) map.get(str);
                j75Var.invalidate();
            }
        }

        @Override // defpackage.ofc
        @snc(name = "values")
        public void setValues(j75 j75Var, ReadableArray readableArray) {
            j75Var.e = readableArray;
            j75Var.invalidate();
        }

        @Override // defpackage.ofc
        @snc(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((ob5) view, dynamic);
        }

        @Override // defpackage.ofc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((ob5) view, dynamic);
        }

        @Override // defpackage.ofc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((ob5) view, dynamic);
        }
    }

    public static class FeCompositeManager extends FilterPrimitiveManager<k75> implements qfc<k75> {
        public static final String REACT_CLASS = "RNSVGFeComposite";

        public FeCompositeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeComposite);
            ((VirtualViewManager) this).mDelegate = new pfc(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.qfc
        @snc(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((ob5) view, dynamic);
        }

        @Override // defpackage.qfc
        @snc(name = "in1")
        public void setIn1(k75 k75Var, String str) {
            k75Var.c = str;
            k75Var.invalidate();
        }

        @Override // defpackage.qfc
        @snc(name = "in2")
        public void setIn2(k75 k75Var, String str) {
            k75Var.d = str;
            k75Var.invalidate();
        }

        @Override // defpackage.qfc
        @snc(name = "k1")
        public void setK1(k75 k75Var, float f) {
            k75Var.getClass();
            k75Var.e = f;
            k75Var.invalidate();
        }

        @Override // defpackage.qfc
        @snc(name = "k2")
        public void setK2(k75 k75Var, float f) {
            k75Var.getClass();
            k75Var.f = f;
            k75Var.invalidate();
        }

        @Override // defpackage.qfc
        @snc(name = "k3")
        public void setK3(k75 k75Var, float f) {
            k75Var.getClass();
            k75Var.V = f;
            k75Var.invalidate();
        }

        @Override // defpackage.qfc
        @snc(name = "k4")
        public void setK4(k75 k75Var, float f) {
            k75Var.getClass();
            k75Var.W = f;
            k75Var.invalidate();
        }

        @Override // defpackage.qfc
        @snc(name = "operator1")
        public void setOperator1(k75 k75Var, String str) {
            k75Var.getClass();
            HashMap map = sb5.b;
            if (!map.containsKey(str)) {
                l5.q(l5.l("Unknown String Value: ", str));
            } else {
                k75Var.a0 = (sb5) map.get(str);
                k75Var.invalidate();
            }
        }

        @Override // defpackage.qfc
        @snc(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((ob5) view, str);
        }

        @Override // defpackage.qfc
        @snc(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((ob5) view, dynamic);
        }

        @Override // defpackage.qfc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((ob5) view, dynamic);
        }

        @Override // defpackage.qfc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((ob5) view, dynamic);
        }
    }

    public static class FeGaussianBlurManager extends FilterPrimitiveManager<l75> implements ufc<l75> {
        public static final String REACT_CLASS = "RNSVGFeGaussianBlur";

        public FeGaussianBlurManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeGaussianBlur);
            ((VirtualViewManager) this).mDelegate = new tfc(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.ufc
        @snc(name = "values")
        public void setEdgeMode(l75 l75Var, String str) {
            l75Var.getClass();
            HashMap map = pb5.a;
            if (!map.containsKey(str)) {
                l5.q(l5.l("Unknown 'edgeMode' Value: ", str));
            } else {
                l75Var.invalidate();
            }
        }

        @Override // defpackage.ufc
        @snc(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((ob5) view, dynamic);
        }

        @Override // defpackage.ufc
        @snc(name = "in1")
        public void setIn1(l75 l75Var, String str) {
            l75Var.c = str;
            l75Var.invalidate();
        }

        @Override // defpackage.ufc
        @snc(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((ob5) view, str);
        }

        @Override // defpackage.ufc
        @snc(name = "stdDeviationX")
        public void setStdDeviationX(l75 l75Var, float f) {
            l75Var.d = f;
            l75Var.invalidate();
        }

        @Override // defpackage.ufc
        @snc(name = "stdDeviationY")
        public void setStdDeviationY(l75 l75Var, float f) {
            l75Var.e = f;
            l75Var.invalidate();
        }

        @Override // defpackage.ufc
        @snc(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((ob5) view, dynamic);
        }

        @Override // defpackage.ufc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((ob5) view, dynamic);
        }

        @Override // defpackage.ufc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((ob5) view, dynamic);
        }
    }

    public static class FeMergeManager extends FilterPrimitiveManager<m75> implements vfc<m75> {
        public static final String REACT_CLASS = "RNSVGFeMerge";

        public FeMergeManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeMerge);
            ((VirtualViewManager) this).mDelegate = new mw9(this, 2);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.vfc
        @snc(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((ob5) view, dynamic);
        }

        @Override // defpackage.vfc
        @snc(name = "nodes")
        public void setNodes(m75 m75Var, ReadableArray readableArray) {
            m75Var.c = readableArray;
            m75Var.invalidate();
        }

        @Override // defpackage.vfc
        @snc(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((ob5) view, str);
        }

        @Override // defpackage.vfc
        @snc(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((ob5) view, dynamic);
        }

        @Override // defpackage.vfc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((ob5) view, dynamic);
        }

        @Override // defpackage.vfc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((ob5) view, dynamic);
        }
    }

    public static class FeOffsetManager extends FilterPrimitiveManager<n75> implements xfc<n75> {
        public static final String REACT_CLASS = "RNSVGFeOffset";

        public FeOffsetManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeOffset);
            ((VirtualViewManager) this).mDelegate = new wfc(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.xfc
        @snc(name = "dx")
        public void setDx(n75 n75Var, Dynamic dynamic) {
            n75Var.getClass();
            n75Var.d = SVGLength.b(dynamic);
            n75Var.invalidate();
        }

        @Override // defpackage.xfc
        @snc(name = "dy")
        public void setDy(n75 n75Var, Dynamic dynamic) {
            n75Var.getClass();
            n75Var.e = SVGLength.b(dynamic);
            n75Var.invalidate();
        }

        @Override // defpackage.xfc
        @snc(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((ob5) view, dynamic);
        }

        @Override // defpackage.xfc
        @snc(name = "in1")
        public void setIn1(n75 n75Var, String str) {
            n75Var.c = str;
            n75Var.invalidate();
        }

        @Override // defpackage.xfc
        @snc(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((ob5) view, str);
        }

        @Override // defpackage.xfc
        @snc(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((ob5) view, dynamic);
        }

        @Override // defpackage.xfc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((ob5) view, dynamic);
        }

        @Override // defpackage.xfc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((ob5) view, dynamic);
        }
    }

    public static class FilterManager extends VirtualViewManager<f> implements zfc<f> {
        public static final String REACT_CLASS = "RNSVGFilter";

        public FilterManager() {
            super(VirtualViewManager.SVGClass.RNSVGFilter);
            ((VirtualViewManager) this).mDelegate = new yfc(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.zfc
        @snc(name = "filterUnits")
        public void setFilterUnits(f fVar, String str) {
            fVar.getClass();
            fVar.b = tb5.a(str);
            fVar.invalidate();
        }

        @Override // defpackage.zfc
        @snc(name = "height")
        public void setHeight(f fVar, Dynamic dynamic) {
            fVar.d.setHeight(dynamic);
            fVar.invalidate();
        }

        @Override // defpackage.zfc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // defpackage.zfc
        @snc(name = "primitiveUnits")
        public void setPrimitiveUnits(f fVar, String str) {
            fVar.getClass();
            fVar.c = tb5.a(str);
            fVar.invalidate();
        }

        @Override // defpackage.zfc
        @snc(name = "width")
        public void setWidth(f fVar, Dynamic dynamic) {
            fVar.d.setWidth(dynamic);
            fVar.invalidate();
        }

        @Override // defpackage.zfc
        @snc(name = "x")
        public void setX(f fVar, Dynamic dynamic) {
            fVar.d.setX(dynamic);
            fVar.invalidate();
        }

        @Override // defpackage.zfc
        @snc(name = "y")
        public void setY(f fVar, Dynamic dynamic) {
            fVar.d.setY(dynamic);
            fVar.invalidate();
        }
    }

    public static class FilterPrimitiveManager<T extends ob5> extends VirtualViewManager<T> {
        public FilterPrimitiveManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @snc(name = "height")
        public void setHeight(T t, Dynamic dynamic) {
            t.b.setHeight(dynamic);
            t.invalidate();
        }

        @snc(name = "result")
        public void setResult(T t, String str) {
            t.a = str;
            t.invalidate();
        }

        @snc(name = "width")
        public void setWidth(T t, Dynamic dynamic) {
            t.b.setWidth(dynamic);
            t.invalidate();
        }

        @snc(name = "x")
        public void setX(T t, Dynamic dynamic) {
            t.b.setX(dynamic);
            t.invalidate();
        }

        @snc(name = "y")
        public void setY(T t, Dynamic dynamic) {
            t.b.setY(dynamic);
            t.invalidate();
        }
    }

    public static class ForeignObjectManager extends GroupViewManagerAbstract<g> implements bgc<g> {
        public static final String REACT_CLASS = "RNSVGForeignObject";

        public ForeignObjectManager() {
            super(VirtualViewManager.SVGClass.RNSVGForeignObject);
            ((VirtualViewManager) this).mDelegate = new agc(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.bgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.bgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.bgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.bgc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h) view, dynamic);
        }

        @Override // defpackage.bgc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.bgc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.bgc
        @snc(name = "height")
        public void setHeight(g gVar, Dynamic dynamic) {
            gVar.getClass();
            gVar.a0 = SVGLength.b(dynamic);
            gVar.invalidate();
        }

        @Override // defpackage.bgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.bgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.bgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.bgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.bgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.bgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.bgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.bgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.bgc
        @snc(name = "width")
        public void setWidth(g gVar, Dynamic dynamic) {
            gVar.getClass();
            gVar.W = SVGLength.b(dynamic);
            gVar.invalidate();
        }

        @Override // defpackage.bgc
        @snc(name = "x")
        public void setX(g gVar, Dynamic dynamic) {
            gVar.getClass();
            gVar.f = SVGLength.b(dynamic);
            gVar.invalidate();
        }

        @Override // defpackage.bgc
        @snc(name = "y")
        public void setY(g gVar, Dynamic dynamic) {
            gVar.getClass();
            gVar.V = SVGLength.b(dynamic);
            gVar.invalidate();
        }
    }

    public static class GroupViewManager extends GroupViewManagerAbstract<h> implements dgc<h> {
        public static final String REACT_CLASS = "RNSVGGroup";

        public GroupViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGGroup);
            ((VirtualViewManager) this).mDelegate = new cgc(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.dgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.dgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.dgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.dgc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h) view, dynamic);
        }

        @Override // defpackage.dgc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.dgc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.dgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.dgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.dgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.dgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.dgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.dgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.dgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.dgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.dgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }
    }

    public static class GroupViewManagerAbstract<U extends h> extends RenderableViewManager<U> {
        public GroupViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @snc(name = "font")
        public void setFont(U u, Dynamic dynamic) {
            u.getClass();
            if (dynamic.getType() == ReadableType.Map) {
                u.a = dynamic.asMap();
            } else {
                u.a = null;
            }
            u.invalidate();
        }

        @snc(name = "fontSize")
        public void setFontSize(U u, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = a.a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            }
            u.a = javaOnlyMap;
            u.invalidate();
        }

        @snc(name = "fontWeight")
        public void setFontWeight(U u, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = a.a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            }
            u.a = javaOnlyMap;
            u.invalidate();
        }
    }

    public static class ImageViewManager extends RenderableViewManager<j> implements fgc<j> {
        public static final String REACT_CLASS = "RNSVGImage";

        public ImageViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGImage);
            ((VirtualViewManager) this).mDelegate = new egc(this);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
            HashMap map = new HashMap();
            map.put(SvgLoadEvent.EVENT_NAME, gb9.a("registrationName", "onLoad"));
            return map;
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.fgc
        @snc(name = "align")
        public void setAlign(j jVar, String str) {
            jVar.W = str;
            jVar.invalidate();
        }

        @Override // defpackage.fgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.fgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.fgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.fgc
        @snc(name = "height")
        public void setHeight(j jVar, Dynamic dynamic) {
            jVar.getClass();
            jVar.d = SVGLength.b(dynamic);
            jVar.invalidate();
        }

        @Override // defpackage.fgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.fgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.fgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.fgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.fgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.fgc
        @snc(name = "meetOrSlice")
        public void setMeetOrSlice(j jVar, int i) {
            jVar.a0 = i;
            jVar.invalidate();
        }

        @Override // defpackage.fgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.fgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.fgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        @Override // defpackage.fgc
        @snc(customType = "ImageSource", name = "src")
        public void setSrc(j jVar, ReadableMap readableMap) {
            jVar.getClass();
            if (readableMap != null) {
                String string = readableMap.getString("uri");
                jVar.e = string;
                if (string == null || string.isEmpty()) {
                    return;
                }
                if (readableMap.hasKey("width") && readableMap.hasKey("height")) {
                    jVar.f = readableMap.getInt("width");
                    jVar.V = readableMap.getInt("height");
                } else {
                    jVar.f = 0;
                    jVar.V = 0;
                }
                if (Uri.parse(jVar.e).getScheme() == null) {
                    m5d m5dVar = m5d.a;
                    m5d.b(jVar.mContext, jVar.e);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.fgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.fgc
        @snc(name = "width")
        public void setWidth(j jVar, Dynamic dynamic) {
            jVar.getClass();
            jVar.c = SVGLength.b(dynamic);
            jVar.invalidate();
        }

        @Override // defpackage.fgc
        @snc(name = "x")
        public void setX(j jVar, Dynamic dynamic) {
            jVar.getClass();
            jVar.a = SVGLength.b(dynamic);
            jVar.invalidate();
        }

        @Override // defpackage.fgc
        @snc(name = "y")
        public void setY(j jVar, Dynamic dynamic) {
            jVar.getClass();
            jVar.b = SVGLength.b(dynamic);
            jVar.invalidate();
        }
    }

    public static class LineViewManager extends RenderableViewManager<k> implements hgc<k> {
        public static final String REACT_CLASS = "RNSVGLine";

        public LineViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGLine);
            ((VirtualViewManager) this).mDelegate = new ggc(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.hgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.hgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.hgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.hgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.hgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.hgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.hgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.hgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.hgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.hgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.hgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.hgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.hgc
        @snc(name = "x1")
        public void setX1(k kVar, Dynamic dynamic) {
            kVar.getClass();
            kVar.a = SVGLength.b(dynamic);
            kVar.invalidate();
        }

        @Override // defpackage.hgc
        @snc(name = "x2")
        public void setX2(k kVar, Dynamic dynamic) {
            kVar.getClass();
            kVar.c = SVGLength.b(dynamic);
            kVar.invalidate();
        }

        @Override // defpackage.hgc
        @snc(name = "y1")
        public void setY1(k kVar, Dynamic dynamic) {
            kVar.getClass();
            kVar.b = SVGLength.b(dynamic);
            kVar.invalidate();
        }

        @Override // defpackage.hgc
        @snc(name = "y2")
        public void setY2(k kVar, Dynamic dynamic) {
            kVar.getClass();
            kVar.d = SVGLength.b(dynamic);
            kVar.invalidate();
        }
    }

    public static class LinearGradientManager extends VirtualViewManager<l> implements jgc<l> {
        public static final String REACT_CLASS = "RNSVGLinearGradient";

        public LinearGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGLinearGradient);
            ((VirtualViewManager) this).mDelegate = new igc(this);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.jgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.jgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        @Override // defpackage.jgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // defpackage.jgc
        @snc(name = "gradient")
        public void setGradient(l lVar, ReadableArray readableArray) {
            lVar.e = readableArray;
            lVar.invalidate();
        }

        @Override // defpackage.jgc
        @snc(name = "gradientTransform")
        public void setGradientTransform(l lVar, ReadableArray readableArray) {
            if (readableArray != null) {
                float[] fArr = l.W;
                int iC = p.c(readableArray, fArr, lVar.mScale);
                if (iC == 6) {
                    if (lVar.V == null) {
                        lVar.V = new Matrix();
                    }
                    lVar.V.setValues(fArr);
                } else if (iC != -1) {
                    s55.n("ReactNative", "RNSVG: Transform matrices must be of size 6");
                }
            } else {
                lVar.V = null;
            }
            lVar.invalidate();
        }

        @Override // defpackage.jgc
        @snc(name = "gradientUnits")
        public void setGradientUnits(l lVar, int i) {
            if (i == 0) {
                lVar.f = a.b.a;
            } else if (i == 1) {
                lVar.f = a.b.b;
            }
            lVar.invalidate();
        }

        @Override // defpackage.jgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.jgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.jgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.jgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.jgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.jgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.jgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // defpackage.jgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        @Override // defpackage.jgc
        @snc(name = "x1")
        public void setX1(l lVar, Dynamic dynamic) {
            lVar.getClass();
            lVar.a = SVGLength.b(dynamic);
            lVar.invalidate();
        }

        @Override // defpackage.jgc
        @snc(name = "x2")
        public void setX2(l lVar, Dynamic dynamic) {
            lVar.getClass();
            lVar.c = SVGLength.b(dynamic);
            lVar.invalidate();
        }

        @Override // defpackage.jgc
        @snc(name = "y1")
        public void setY1(l lVar, Dynamic dynamic) {
            lVar.getClass();
            lVar.b = SVGLength.b(dynamic);
            lVar.invalidate();
        }

        @Override // defpackage.jgc
        @snc(name = "y2")
        public void setY2(l lVar, Dynamic dynamic) {
            lVar.getClass();
            lVar.d = SVGLength.b(dynamic);
            lVar.invalidate();
        }
    }

    public static class MarkerManager extends GroupViewManagerAbstract<m> implements lgc<m> {
        public static final String REACT_CLASS = "RNSVGMarker";

        public MarkerManager() {
            super(VirtualViewManager.SVGClass.RNSVGMarker);
            ((VirtualViewManager) this).mDelegate = new kgc(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.lgc
        @snc(name = "align")
        public void setAlign(m mVar, String str) {
            mVar.h0 = str;
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.lgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.lgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.lgc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h) view, dynamic);
        }

        @Override // defpackage.lgc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.lgc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.lgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.lgc
        @snc(name = "markerHeight")
        public void setMarkerHeight(m mVar, Dynamic dynamic) {
            mVar.getClass();
            mVar.a0 = SVGLength.b(dynamic);
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.lgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.lgc
        @snc(name = "markerUnits")
        public void setMarkerUnits(m mVar, String str) {
            mVar.b0 = str;
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "markerWidth")
        public void setMarkerWidth(m mVar, Dynamic dynamic) {
            mVar.getClass();
            mVar.W = SVGLength.b(dynamic);
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.lgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.lgc
        @snc(name = "meetOrSlice")
        public void setMeetOrSlice(m mVar, int i) {
            mVar.i0 = i;
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "minX")
        public void setMinX(m mVar, float f) {
            mVar.d0 = f;
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "minY")
        public void setMinY(m mVar, float f) {
            mVar.e0 = f;
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.lgc
        @snc(name = "orient")
        public void setOrient(m mVar, String str) {
            mVar.c0 = str;
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.lgc
        @snc(name = "refX")
        public void setRefX(m mVar, Dynamic dynamic) {
            mVar.getClass();
            mVar.f = SVGLength.b(dynamic);
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "refY")
        public void setRefY(m mVar, Dynamic dynamic) {
            mVar.getClass();
            mVar.V = SVGLength.b(dynamic);
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // defpackage.lgc
        @snc(name = "vbHeight")
        public void setVbHeight(m mVar, float f) {
            mVar.g0 = f;
            mVar.invalidate();
        }

        @Override // defpackage.lgc
        @snc(name = "vbWidth")
        public void setVbWidth(m mVar, float f) {
            mVar.f0 = f;
            mVar.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.lgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }
    }

    public static class PathViewManager extends RenderableViewManager<p6b> implements pgc<p6b> {
        public static final String REACT_CLASS = "RNSVGPath";

        public PathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGPath);
            ((VirtualViewManager) this).mDelegate = new tec(this, 1);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.pgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.pgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.pgc
        @snc(name = "d")
        public void setD(p6b p6bVar, String str) {
            p6bVar.getClass();
            hh1.e0 = new ArrayList();
            Path path = new Path();
            hh1.d0 = path;
            if (str != null) {
                hh1.b0 = str.length();
                hh1.c0 = str;
                hh1.a0 = 0;
                hh1.f0 = 0.0f;
                hh1.g0 = 0.0f;
                hh1.h0 = 0.0f;
                hh1.i0 = 0.0f;
                hh1.j0 = 0.0f;
                hh1.k0 = 0.0f;
                hh1.l0 = false;
                char c = ' ';
                while (hh1.a0 < hh1.b0) {
                    hh1.U();
                    int i = hh1.a0;
                    if (i >= hh1.b0) {
                        path = hh1.d0;
                    } else {
                        boolean z = true;
                        boolean z2 = c != ' ';
                        char cCharAt = hh1.c0.charAt(i);
                        if (!z2 && cCharAt != 'M' && cCharAt != 'm') {
                            t40.q("Unexpected character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(cCharAt), Integer.valueOf(hh1.a0), hh1.c0});
                            return;
                        }
                        switch (cCharAt) {
                            case 'A':
                            case 'C':
                            case 'H':
                            case 'L':
                            case 'M':
                            case 'Q':
                            case 'S':
                            case 'T':
                            case 'V':
                            case 'Z':
                            case 'a':
                            case 'c':
                            case 'h':
                            case 'l':
                            case 'm':
                            case 'q':
                            case 's':
                            case 't':
                            case 'v':
                            case 'z':
                                hh1.a0++;
                                z = false;
                                c = cCharAt;
                                break;
                            default:
                                if (((cCharAt < '0' || cCharAt > '9') && cCharAt != '.' && cCharAt != '-' && cCharAt != '+') || !z2) {
                                    t40.q("Unexpected character '%c' (i=%d, s=%s)", new Object[]{Character.valueOf(cCharAt), Integer.valueOf(hh1.a0), hh1.c0});
                                    return;
                                }
                                if (c == 'Z' || c == 'z') {
                                    l5.q(l5.m("Unexpected number after 'z' (s=", hh1.c0, ")"));
                                    return;
                                } else if (c != 'M' && c != 'm') {
                                    z = false;
                                } else if (Character.isUpperCase(c)) {
                                    c = 'L';
                                } else {
                                    c = 'l';
                                }
                                break;
                                break;
                        }
                        boolean zIsUpperCase = Character.isUpperCase(c);
                        switch (c) {
                            case 'A':
                                hh1.k(hh1.N(), hh1.N(), hh1.N(), hh1.M(), hh1.M(), hh1.N(), hh1.N());
                                break;
                            case 'C':
                                float fN = hh1.N();
                                float fN2 = hh1.N();
                                float fN3 = hh1.N();
                                float fN4 = hh1.N();
                                float fN5 = hh1.N();
                                float fN6 = hh1.N();
                                hh1.h0 = fN3;
                                hh1.i0 = fN4;
                                hh1.t(fN, fN2, fN3, fN4, fN5, fN6);
                                break;
                            case 'H':
                                hh1.I(hh1.N(), hh1.g0);
                                break;
                            case 'L':
                                hh1.I(hh1.N(), hh1.N());
                                break;
                            case 'M':
                                hh1.J(hh1.N(), hh1.N());
                                break;
                            case 'Q':
                                hh1.O(hh1.N(), hh1.N(), hh1.N(), hh1.N());
                                break;
                            case 'S':
                                float fN7 = hh1.N();
                                float fN8 = hh1.N();
                                float fN9 = hh1.N();
                                float fN10 = hh1.N();
                                float f = (hh1.f0 * 2.0f) - hh1.h0;
                                float f2 = (hh1.g0 * 2.0f) - hh1.i0;
                                hh1.h0 = fN7;
                                hh1.i0 = fN8;
                                hh1.t(f, f2, fN7, fN8, fN9, fN10);
                                break;
                            case 'T':
                                hh1.O((hh1.f0 * 2.0f) - hh1.h0, (hh1.g0 * 2.0f) - hh1.i0, hh1.N(), hh1.N());
                                break;
                            case 'V':
                                hh1.I(hh1.f0, hh1.N());
                                break;
                            case 'Z':
                            case 'z':
                                if (hh1.l0) {
                                    hh1.f0 = hh1.j0;
                                    hh1.g0 = hh1.k0;
                                    hh1.l0 = false;
                                    hh1.d0.close();
                                    hh1.e0.add(new c6b(ip4.d, new ieb[]{new ieb(hh1.f0, hh1.g0)}));
                                }
                                break;
                            case 'a':
                                hh1.k(hh1.N(), hh1.N(), hh1.N(), hh1.M(), hh1.M(), hh1.N() + hh1.f0, hh1.N() + hh1.g0);
                                break;
                            case 'c':
                                float fN11 = hh1.N();
                                float fN12 = hh1.N();
                                float fN13 = hh1.N();
                                float fN14 = hh1.N();
                                float fN15 = hh1.N();
                                float fN16 = hh1.N();
                                float f3 = hh1.f0;
                                float f4 = fN11 + f3;
                                float f5 = hh1.g0;
                                float f6 = fN13 + f3;
                                float f7 = fN14 + f5;
                                hh1.h0 = f6;
                                hh1.i0 = f7;
                                hh1.t(f4, fN12 + f5, f6, f7, fN15 + f3, fN16 + f5);
                                break;
                            case 'h':
                                hh1.I(hh1.N() + hh1.f0, hh1.g0 + 0.0f);
                                break;
                            case 'l':
                                hh1.I(hh1.N() + hh1.f0, hh1.N() + hh1.g0);
                                break;
                            case 'm':
                                hh1.J(hh1.N() + hh1.f0, hh1.N() + hh1.g0);
                                break;
                            case 'q':
                                float fN17 = hh1.N();
                                float fN18 = hh1.N();
                                float fN19 = hh1.N();
                                float fN20 = hh1.N();
                                float f8 = hh1.f0;
                                float f9 = hh1.g0;
                                hh1.O(fN17 + f8, fN18 + f9, fN19 + f8, fN20 + f9);
                                break;
                            case 's':
                                float fN21 = hh1.N();
                                float fN22 = hh1.N();
                                float fN23 = hh1.N();
                                float fN24 = hh1.N();
                                float f10 = hh1.f0;
                                float f11 = fN21 + f10;
                                float f12 = hh1.g0;
                                float f13 = fN22 + f12;
                                float f14 = (f10 * 2.0f) - hh1.h0;
                                float f15 = (f12 * 2.0f) - hh1.i0;
                                hh1.h0 = f11;
                                hh1.i0 = f13;
                                hh1.t(f14, f15, f11, f13, fN23 + f10, fN24 + f12);
                                break;
                            case 't':
                                float fN25 = hh1.N();
                                float fN26 = hh1.N();
                                float f16 = hh1.f0;
                                float f17 = hh1.g0;
                                hh1.O((f16 * 2.0f) - hh1.h0, (f17 * 2.0f) - hh1.i0, fN25 + f16, fN26 + f17);
                                break;
                            case 'v':
                                hh1.I(hh1.f0 + 0.0f, hh1.N() + hh1.g0);
                                break;
                            default:
                                t40.q("Unexpected comand '%c' (s=%s)", new Object[]{Character.valueOf(c), hh1.c0});
                                return;
                        }
                        if (z) {
                            c = zIsUpperCase ? 'M' : 'm';
                        }
                    }
                }
                path = hh1.d0;
            }
            p6bVar.a = path;
            ArrayList<c6b> arrayList = hh1.e0;
            p6bVar.elements = arrayList;
            Iterator<c6b> it = arrayList.iterator();
            while (it.hasNext()) {
                for (ieb iebVar : it.next().b) {
                    double d = iebVar.a;
                    double d2 = p6bVar.mScale;
                    iebVar.a = d * d2;
                    iebVar.b *= d2;
                }
            }
            p6bVar.invalidate();
        }

        @Override // defpackage.pgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.pgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.pgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.pgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.pgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.pgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.pgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.pgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.pgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }
    }

    public static class PatternManager extends GroupViewManagerAbstract<o> implements qgc<o> {
        public static final String REACT_CLASS = "RNSVGPattern";

        public PatternManager() {
            super(VirtualViewManager.SVGClass.RNSVGPattern);
            ((VirtualViewManager) this).mDelegate = new vec(this, 1);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.qgc
        @snc(name = "align")
        public void setAlign(o oVar, String str) {
            oVar.h0 = str;
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.qgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.qgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.qgc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h) view, dynamic);
        }

        @Override // defpackage.qgc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.qgc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.qgc
        @snc(name = "height")
        public void setHeight(o oVar, Dynamic dynamic) {
            oVar.getClass();
            oVar.a0 = SVGLength.b(dynamic);
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.qgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.qgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.qgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.qgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.qgc
        @snc(name = "meetOrSlice")
        public void setMeetOrSlice(o oVar, int i) {
            oVar.i0 = i;
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "minX")
        public void setMinX(o oVar, float f) {
            oVar.d0 = f;
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "minY")
        public void setMinY(o oVar, float f) {
            oVar.e0 = f;
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.qgc
        @snc(name = "patternContentUnits")
        public void setPatternContentUnits(o oVar, int i) {
            if (i == 0) {
                oVar.c0 = a.b.a;
            } else if (i == 1) {
                oVar.c0 = a.b.b;
            }
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "patternTransform")
        public void setPatternTransform(o oVar, ReadableArray readableArray) {
            if (readableArray != null) {
                float[] fArr = o.k0;
                int iC = p.c(readableArray, fArr, oVar.mScale);
                if (iC == 6) {
                    if (oVar.j0 == null) {
                        oVar.j0 = new Matrix();
                    }
                    oVar.j0.setValues(fArr);
                } else if (iC != -1) {
                    s55.n("ReactNative", "RNSVG: Transform matrices must be of size 6");
                }
            } else {
                oVar.j0 = null;
            }
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "patternUnits")
        public void setPatternUnits(o oVar, int i) {
            if (i == 0) {
                oVar.b0 = a.b.a;
            } else if (i == 1) {
                oVar.b0 = a.b.b;
            }
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.qgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // defpackage.qgc
        @snc(name = "vbHeight")
        public void setVbHeight(o oVar, float f) {
            oVar.g0 = f;
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "vbWidth")
        public void setVbWidth(o oVar, float f) {
            oVar.f0 = f;
            oVar.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.qgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.qgc
        @snc(name = "width")
        public void setWidth(o oVar, Dynamic dynamic) {
            oVar.getClass();
            oVar.W = SVGLength.b(dynamic);
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "x")
        public void setX(o oVar, Dynamic dynamic) {
            oVar.getClass();
            oVar.f = SVGLength.b(dynamic);
            oVar.invalidate();
        }

        @Override // defpackage.qgc
        @snc(name = "y")
        public void setY(o oVar, Dynamic dynamic) {
            oVar.getClass();
            oVar.V = SVGLength.b(dynamic);
            oVar.invalidate();
        }
    }

    public static class RadialGradientManager extends VirtualViewManager<q> implements rgc<q> {
        public static final String REACT_CLASS = "RNSVGRadialGradient";

        public RadialGradientManager() {
            super(VirtualViewManager.SVGClass.RNSVGRadialGradient);
            ((VirtualViewManager) this).mDelegate = new xec(this, 1);
        }

        @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.rgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.rgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        @Override // defpackage.rgc
        @snc(name = "cx")
        public void setCx(q qVar, Dynamic dynamic) {
            qVar.getClass();
            qVar.e = SVGLength.b(dynamic);
            qVar.invalidate();
        }

        @Override // defpackage.rgc
        @snc(name = "cy")
        public void setCy(q qVar, Dynamic dynamic) {
            qVar.getClass();
            qVar.f = SVGLength.b(dynamic);
            qVar.invalidate();
        }

        @Override // defpackage.rgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // defpackage.rgc
        @snc(name = "fx")
        public void setFx(q qVar, Dynamic dynamic) {
            qVar.getClass();
            qVar.a = SVGLength.b(dynamic);
            qVar.invalidate();
        }

        @Override // defpackage.rgc
        @snc(name = "fy")
        public void setFy(q qVar, Dynamic dynamic) {
            qVar.getClass();
            qVar.b = SVGLength.b(dynamic);
            qVar.invalidate();
        }

        @Override // defpackage.rgc
        @snc(name = "gradient")
        public void setGradient(q qVar, ReadableArray readableArray) {
            qVar.V = readableArray;
            qVar.invalidate();
        }

        @Override // defpackage.rgc
        @snc(name = "gradientTransform")
        public void setGradientTransform(q qVar, ReadableArray readableArray) {
            if (readableArray != null) {
                float[] fArr = q.b0;
                int iC = p.c(readableArray, fArr, qVar.mScale);
                if (iC == 6) {
                    if (qVar.a0 == null) {
                        qVar.a0 = new Matrix();
                    }
                    qVar.a0.setValues(fArr);
                } else if (iC != -1) {
                    s55.n("ReactNative", "RNSVG: Transform matrices must be of size 6");
                }
            } else {
                qVar.a0 = null;
            }
            qVar.invalidate();
        }

        @Override // defpackage.rgc
        @snc(name = "gradientUnits")
        public void setGradientUnits(q qVar, int i) {
            if (i == 0) {
                qVar.W = a.b.a;
            } else if (i == 1) {
                qVar.W = a.b.b;
            }
            qVar.invalidate();
        }

        @Override // defpackage.rgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.rgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.rgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.rgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.rgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.rgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.rgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        @Override // defpackage.rgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        @Override // defpackage.rgc
        @snc(name = "rx")
        public void setRx(q qVar, Dynamic dynamic) {
            qVar.getClass();
            qVar.c = SVGLength.b(dynamic);
            qVar.invalidate();
        }

        @Override // defpackage.rgc
        @snc(name = "ry")
        public void setRy(q qVar, Dynamic dynamic) {
            qVar.getClass();
            qVar.d = SVGLength.b(dynamic);
            qVar.invalidate();
        }
    }

    public static class RectViewManager extends RenderableViewManager<r> implements sgc<r> {
        public static final String REACT_CLASS = "RNSVGRect";

        public RectViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGRect);
            ((VirtualViewManager) this).mDelegate = new yec(this, 1);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.sgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.sgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.sgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.sgc
        @snc(name = "height")
        public void setHeight(r rVar, Dynamic dynamic) {
            rVar.getClass();
            rVar.d = SVGLength.b(dynamic);
            rVar.invalidate();
        }

        @Override // defpackage.sgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.sgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.sgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.sgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.sgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.sgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.sgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.sgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        @Override // defpackage.sgc
        @snc(name = "rx")
        public void setRx(r rVar, Dynamic dynamic) {
            rVar.getClass();
            rVar.e = SVGLength.b(dynamic);
            rVar.invalidate();
        }

        @Override // defpackage.sgc
        @snc(name = "ry")
        public void setRy(r rVar, Dynamic dynamic) {
            rVar.getClass();
            rVar.f = SVGLength.b(dynamic);
            rVar.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.sgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.sgc
        @snc(name = "width")
        public void setWidth(r rVar, Dynamic dynamic) {
            rVar.getClass();
            rVar.c = SVGLength.b(dynamic);
            rVar.invalidate();
        }

        @Override // defpackage.sgc
        @snc(name = "x")
        public void setX(r rVar, Dynamic dynamic) {
            rVar.getClass();
            rVar.a = SVGLength.b(dynamic);
            rVar.invalidate();
        }

        @Override // defpackage.sgc
        @snc(name = "y")
        public void setY(r rVar, Dynamic dynamic) {
            rVar.getClass();
            rVar.b = SVGLength.b(dynamic);
            rVar.invalidate();
        }
    }

    public static class SymbolManager extends GroupViewManagerAbstract<s> implements ugc<s> {
        public static final String REACT_CLASS = "RNSVGSymbol";

        public SymbolManager() {
            super(VirtualViewManager.SVGClass.RNSVGSymbol);
            ((VirtualViewManager) this).mDelegate = new bfc(this, 1);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.ugc
        @snc(name = "align")
        public void setAlign(s sVar, String str) {
            sVar.b0 = str;
            sVar.invalidate();
        }

        @Override // defpackage.ugc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.ugc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.ugc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.ugc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h) view, dynamic);
        }

        @Override // defpackage.ugc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.ugc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.ugc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.ugc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.ugc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.ugc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.ugc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.ugc
        @snc(name = "meetOrSlice")
        public void setMeetOrSlice(s sVar, int i) {
            sVar.c0 = i;
            sVar.invalidate();
        }

        @Override // defpackage.ugc
        @snc(name = "minX")
        public void setMinX(s sVar, float f) {
            sVar.f = f;
            sVar.invalidate();
        }

        @Override // defpackage.ugc
        @snc(name = "minY")
        public void setMinY(s sVar, float f) {
            sVar.V = f;
            sVar.invalidate();
        }

        @Override // defpackage.ugc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.ugc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.ugc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // defpackage.ugc
        @snc(name = "vbHeight")
        public void setVbHeight(s sVar, float f) {
            sVar.a0 = f;
            sVar.invalidate();
        }

        @Override // defpackage.ugc
        @snc(name = "vbWidth")
        public void setVbWidth(s sVar, float f) {
            sVar.W = f;
            sVar.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ugc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }
    }

    public static class TextViewManagerAbstract<K extends u> extends GroupViewManagerAbstract<K> {
        public TextViewManagerAbstract(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        public void setAlignmentBaseline(K k, String str) {
            k.p(str);
        }

        @snc(name = "baselineShift")
        public void setBaselineShift(K k, Dynamic dynamic) {
            k.getClass();
            k.W = SVGLength.c(dynamic);
            k.invalidate();
        }

        @snc(name = "dx")
        public void setDx(K k, Dynamic dynamic) {
            k.getClass();
            k.f0 = SVGLength.a(dynamic);
            k.invalidate();
        }

        @snc(name = "dy")
        public void setDy(K k, Dynamic dynamic) {
            k.getClass();
            k.g0 = SVGLength.a(dynamic);
            k.invalidate();
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract
        @snc(name = "font")
        public void setFont(K k, Dynamic dynamic) {
            k.getClass();
            if (dynamic.getType() == ReadableType.Map) {
                k.a = dynamic.asMap();
            } else {
                k.a = null;
            }
            k.invalidate();
        }

        @snc(name = "inlineSize")
        public void setInlineSize(K k, Dynamic dynamic) {
            k.getClass();
            k.f = SVGLength.b(dynamic);
            k.invalidate();
        }

        @snc(name = "lengthAdjust")
        public void setLengthAdjust(K k, String str) {
            k.getClass();
            k.a0 = fjf.valueOf(str);
            k.invalidate();
        }

        @snc(name = "alignmentBaseline")
        public void setMethod(K k, String str) {
            k.p(str);
        }

        @snc(name = "rotate")
        public void setRotate(K k, Dynamic dynamic) {
            k.getClass();
            k.e0 = SVGLength.a(dynamic);
            k.invalidate();
        }

        @snc(name = "textLength")
        public void setTextLength(K k, Dynamic dynamic) {
            k.getClass();
            k.V = SVGLength.b(dynamic);
            k.invalidate();
        }

        @snc(name = "verticalAlign")
        public void setVerticalAlign(K k, Dynamic dynamic) {
            k.getClass();
            String strC = SVGLength.c(dynamic);
            if (strC != null) {
                String strTrim = strC.trim();
                int iLastIndexOf = strTrim.lastIndexOf(32);
                try {
                    k.b0 = zif.a(strTrim.substring(iLastIndexOf));
                } catch (IllegalArgumentException unused) {
                    k.b0 = zif.baseline;
                }
                try {
                    k.W = strTrim.substring(0, iLastIndexOf);
                } catch (IndexOutOfBoundsException unused2) {
                    k.W = null;
                }
            } else {
                k.b0 = zif.baseline;
                k.W = null;
            }
            k.invalidate();
        }

        @snc(name = "x")
        public void setX(K k, Dynamic dynamic) {
            k.getClass();
            k.c0 = SVGLength.a(dynamic);
            k.invalidate();
        }

        @snc(name = "y")
        public void setY(K k, Dynamic dynamic) {
            k.getClass();
            k.d0 = SVGLength.a(dynamic);
            k.invalidate();
        }
    }

    public static class UseViewManager extends RenderableViewManager<v> implements ygc<v> {
        public static final String REACT_CLASS = "RNSVGUse";

        public UseViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGUse);
            ((VirtualViewManager) this).mDelegate = new gfc(this, 1);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.ygc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.ygc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.ygc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.ygc
        @snc(name = "height")
        public void setHeight(v vVar, Dynamic dynamic) {
            vVar.getClass();
            vVar.e = SVGLength.b(dynamic);
            vVar.invalidate();
        }

        @Override // defpackage.ygc
        @snc(name = "href")
        public void setHref(v vVar, String str) {
            vVar.a = str;
            vVar.invalidate();
        }

        @Override // defpackage.ygc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.ygc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.ygc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.ygc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.ygc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.ygc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.ygc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.ygc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ygc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.ygc
        @snc(name = "width")
        public void setWidth(v vVar, Dynamic dynamic) {
            vVar.getClass();
            vVar.d = SVGLength.b(dynamic);
            vVar.invalidate();
        }

        @Override // defpackage.ygc
        @snc(name = "x")
        public void setX(v vVar, Dynamic dynamic) {
            vVar.getClass();
            vVar.b = SVGLength.b(dynamic);
            vVar.invalidate();
        }

        @Override // defpackage.ygc
        @snc(name = "y")
        public void setY(v vVar, Dynamic dynamic) {
            vVar.getClass();
            vVar.c = SVGLength.b(dynamic);
            vVar.invalidate();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RenderableViewManager(VirtualViewManager.SVGClass sVGClass) {
        super(sVGClass);
    }

    @Override // com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
    public /* bridge */ /* synthetic */ void removeAllViews(View view) {
        super.removeAllViews(view);
    }

    @snc(customType = "Color", name = "color")
    public void setColor(T t, Integer num) {
        t.setCurrentColor(num);
    }

    @snc(name = "fill")
    public void setFill(T t, Dynamic dynamic) {
        t.setFill(dynamic);
    }

    @snc(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(T t, float f) {
        t.setFillOpacity(f);
    }

    @snc(defaultInt = 1, name = "fillRule")
    public void setFillRule(T t, int i) {
        t.setFillRule(i);
    }

    @snc(name = "filter")
    public void setFilter(T t, String str) {
        t.setFilter(str);
    }

    @snc(name = "propList")
    public void setPropList(T t, ReadableArray readableArray) {
        t.setPropList(readableArray);
    }

    @snc(name = "stroke")
    public void setStroke(T t, Dynamic dynamic) {
        t.setStroke(dynamic);
    }

    @snc(name = "strokeDasharray")
    public void setStrokeDasharray(T t, Dynamic dynamic) {
        t.setStrokeDasharray(dynamic);
    }

    @snc(name = "strokeDashoffset")
    public void setStrokeDashoffset(T t, float f) {
        t.setStrokeDashoffset(f);
    }

    @snc(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(T t, int i) {
        t.setStrokeLinecap(i);
    }

    @snc(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(T t, int i) {
        t.setStrokeLinejoin(i);
    }

    @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(T t, float f) {
        t.setStrokeMiterlimit(f);
    }

    @snc(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(T t, float f) {
        t.setStrokeOpacity(f);
    }

    @snc(name = "strokeWidth")
    public void setStrokeWidth(T t, Dynamic dynamic) {
        t.setStrokeWidth(dynamic);
    }

    @snc(name = "vectorEffect")
    public void setVectorEffect(T t, int i) {
        t.setVectorEffect(i);
    }

    public void setFill(T t, ReadableMap readableMap) {
        t.setFill(readableMap);
    }

    public void setStroke(T t, ReadableMap readableMap) {
        t.setStroke(readableMap);
    }

    public static class MaskManager extends GroupViewManagerAbstract<n> implements ogc<n> {
        public static final String REACT_CLASS = "RNSVGMask";

        public MaskManager() {
            super(VirtualViewManager.SVGClass.RNSVGMask);
            ((VirtualViewManager) this).mDelegate = new f90(this, 2);
        }

        @Override // com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.ogc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.ogc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.ogc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.ogc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((h) view, dynamic);
        }

        @Override // defpackage.ogc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.ogc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.ogc
        @snc(name = "height")
        public void setHeight(n nVar, Dynamic dynamic) {
            nVar.getClass();
            nVar.a0 = SVGLength.b(dynamic);
            nVar.invalidate();
        }

        @Override // defpackage.ogc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.ogc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.ogc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.ogc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.ogc
        @snc(name = "maskType")
        public void setMaskType(n nVar, int i) {
            if (i == 0) {
                nVar.c0 = n.a.a;
            } else if (i == 1) {
                nVar.c0 = n.a.b;
            }
            nVar.invalidate();
        }

        @Override // defpackage.ogc
        @snc(name = "maskUnits")
        public void setMaskUnits(n nVar, int i) {
            if (i == 0) {
                nVar.b0 = a.b.a;
            } else if (i == 1) {
                nVar.b0 = a.b.b;
            }
            nVar.invalidate();
        }

        @Override // defpackage.ogc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.ogc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.ogc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.ogc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.ogc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.ogc
        @snc(name = "width")
        public void setWidth(n nVar, Dynamic dynamic) {
            nVar.getClass();
            nVar.W = SVGLength.b(dynamic);
            nVar.invalidate();
        }

        @Override // defpackage.ogc
        @snc(name = "x")
        public void setX(n nVar, Dynamic dynamic) {
            nVar.getClass();
            nVar.f = SVGLength.b(dynamic);
            nVar.invalidate();
        }

        @Override // defpackage.ogc
        @snc(name = "y")
        public void setY(n nVar, Dynamic dynamic) {
            nVar.getClass();
            nVar.V = SVGLength.b(dynamic);
            nVar.invalidate();
        }

        @Override // defpackage.ogc
        @snc(name = "maskContentUnits")
        public void setMaskContentUnits(n nVar, int i) {
            nVar.invalidate();
        }
    }

    public static class TextPathViewManager extends TextViewManagerAbstract<xif> implements xgc<xif> {
        public static final String REACT_CLASS = "RNSVGTextPath";

        public TextPathViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTextPath);
            ((VirtualViewManager) this).mDelegate = new efc(this, 1);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.xgc
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((u) view, str);
        }

        @Override // defpackage.xgc
        @snc(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((u) view, dynamic);
        }

        @Override // defpackage.xgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.xgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.xgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // defpackage.xgc
        @snc(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((u) view, dynamic);
        }

        @Override // defpackage.xgc
        @snc(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((u) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.xgc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((u) view, dynamic);
        }

        @Override // defpackage.xgc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.xgc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.xgc
        @snc(name = "href")
        public void setHref(xif xifVar, String str) {
            xifVar.i0 = str;
            xifVar.invalidate();
        }

        @Override // defpackage.xgc
        @snc(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((u) view, dynamic);
        }

        @Override // defpackage.xgc
        @snc(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((u) view, str);
        }

        @Override // defpackage.xgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.xgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.xgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.xgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.xgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.xgc
        public void setMidLine(xif xifVar, String str) {
            xifVar.getClass();
            xifVar.k0 = hjf.valueOf(str);
            xifVar.invalidate();
        }

        @Override // defpackage.xgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.xgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.xgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        @Override // defpackage.xgc
        @snc(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((u) view, dynamic);
        }

        @snc(name = "midLine")
        public void setSharp(xif xifVar, String str) {
            xifVar.getClass();
            xifVar.k0 = hjf.valueOf(str);
            xifVar.invalidate();
        }

        @Override // defpackage.xgc
        @snc(name = "side")
        public void setSide(xif xifVar, String str) {
            xifVar.getClass();
            xifVar.j0 = ijf.valueOf(str);
            xifVar.invalidate();
        }

        @Override // defpackage.xgc
        @snc(name = "spacing")
        public void setSpacing(xif xifVar, String str) {
            xifVar.getClass();
            jjf.valueOf(str);
            xifVar.invalidate();
        }

        @Override // defpackage.xgc
        @snc(name = "startOffset")
        public void setStartOffset(xif xifVar, Dynamic dynamic) {
            xifVar.getClass();
            xifVar.l0 = SVGLength.b(dynamic);
            xifVar.invalidate();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // defpackage.xgc
        @snc(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((u) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.xgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.xgc
        @snc(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((u) view, dynamic);
        }

        @Override // defpackage.xgc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((u) view, dynamic);
        }

        @Override // defpackage.xgc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((u) view, dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract
        @snc(name = "method")
        public void setMethod(xif xifVar, String str) {
            xifVar.p(str);
        }

        public TextPathViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new efc(this, 1);
        }
    }

    public static class TSpanViewManager extends TextViewManagerAbstract<t> implements vgc<t> {
        public static final String REACT_CLASS = "RNSVGTSpan";

        public TSpanViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGTSpan);
            ((VirtualViewManager) this).mDelegate = new so9(this, 2);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.vgc
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((u) view, str);
        }

        @Override // defpackage.vgc
        @snc(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((u) view, dynamic);
        }

        @Override // defpackage.vgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.vgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.vgc
        @snc(name = "content")
        public void setContent(t tVar, String str) {
            tVar.j0 = str;
            tVar.invalidate();
        }

        @Override // defpackage.vgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // defpackage.vgc
        @snc(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((u) view, dynamic);
        }

        @Override // defpackage.vgc
        @snc(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((u) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.vgc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((u) view, dynamic);
        }

        @Override // defpackage.vgc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.vgc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.vgc
        @snc(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((u) view, dynamic);
        }

        @Override // defpackage.vgc
        @snc(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((u) view, str);
        }

        @Override // defpackage.vgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.vgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.vgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.vgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.vgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.vgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.vgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.vgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        @Override // defpackage.vgc
        @snc(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((u) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // defpackage.vgc
        @snc(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((u) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.vgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.vgc
        @snc(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((u) view, dynamic);
        }

        @Override // defpackage.vgc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((u) view, dynamic);
        }

        @Override // defpackage.vgc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((u) view, dynamic);
        }

        public TSpanViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new so9(this, 2);
        }
    }

    public static class TextViewManager extends TextViewManagerAbstract<u> implements wgc<u> {
        public static final String REACT_CLASS = "RNSVGText";

        public TextViewManager() {
            super(VirtualViewManager.SVGClass.RNSVGText);
            ((VirtualViewManager) this).mDelegate = new zbc(this, 2);
        }

        @Override // com.horcrux.svg.RenderableViewManager.TextViewManagerAbstract, com.horcrux.svg.RenderableViewManager.GroupViewManagerAbstract, com.horcrux.svg.RenderableViewManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.wgc
        public /* bridge */ /* synthetic */ void setAlignmentBaseline(View view, String str) {
            super.setAlignmentBaseline((u) view, str);
        }

        @Override // defpackage.wgc
        @snc(name = "baselineShift")
        public /* bridge */ /* synthetic */ void setBaselineShift(View view, Dynamic dynamic) {
            super.setBaselineShift((u) view, dynamic);
        }

        @Override // defpackage.wgc
        @snc(name = "clipPath")
        public /* bridge */ /* synthetic */ void setClipPath(View view, String str) {
            super.setClipPath((VirtualView) view, str);
        }

        @Override // defpackage.wgc
        @snc(name = "clipRule")
        public /* bridge */ /* synthetic */ void setClipRule(View view, int i) {
            super.setClipRule((VirtualView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(customType = "Color", name = "color")
        public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
            super.setColor((RenderableView) view, num);
        }

        @Override // defpackage.wgc
        @snc(name = "display")
        public /* bridge */ /* synthetic */ void setDisplay(View view, String str) {
            super.setDisplay((VirtualView) view, str);
        }

        @Override // defpackage.wgc
        @snc(name = "dx")
        public /* bridge */ /* synthetic */ void setDx(View view, Dynamic dynamic) {
            super.setDx((u) view, dynamic);
        }

        @Override // defpackage.wgc
        @snc(name = "dy")
        public /* bridge */ /* synthetic */ void setDy(View view, Dynamic dynamic) {
            super.setDy((u) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(name = "fill")
        public /* bridge */ /* synthetic */ void setFill(View view, Dynamic dynamic) {
            super.setFill((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(defaultFloat = 1.0f, name = "fillOpacity")
        public /* bridge */ /* synthetic */ void setFillOpacity(View view, float f) {
            super.setFillOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(defaultInt = 1, name = "fillRule")
        public /* bridge */ /* synthetic */ void setFillRule(View view, int i) {
            super.setFillRule((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(name = "filter")
        public /* bridge */ /* synthetic */ void setFilter(View view, String str) {
            super.setFilter((RenderableView) view, str);
        }

        @Override // defpackage.wgc
        @snc(name = "font")
        public /* bridge */ /* synthetic */ void setFont(View view, Dynamic dynamic) {
            super.setFont((u) view, dynamic);
        }

        @Override // defpackage.wgc
        @snc(name = "fontSize")
        public /* bridge */ /* synthetic */ void setFontSize(View view, Dynamic dynamic) {
            super.setFontSize((h) view, dynamic);
        }

        @Override // defpackage.wgc
        @snc(name = "fontWeight")
        public /* bridge */ /* synthetic */ void setFontWeight(View view, Dynamic dynamic) {
            super.setFontWeight((h) view, dynamic);
        }

        @Override // defpackage.wgc
        @snc(name = "inlineSize")
        public /* bridge */ /* synthetic */ void setInlineSize(View view, Dynamic dynamic) {
            super.setInlineSize((u) view, dynamic);
        }

        @Override // defpackage.wgc
        @snc(name = "lengthAdjust")
        public /* bridge */ /* synthetic */ void setLengthAdjust(View view, String str) {
            super.setLengthAdjust((u) view, str);
        }

        @Override // defpackage.wgc
        @snc(name = "markerEnd")
        public /* bridge */ /* synthetic */ void setMarkerEnd(View view, String str) {
            super.setMarkerEnd((VirtualView) view, str);
        }

        @Override // defpackage.wgc
        @snc(name = "markerMid")
        public /* bridge */ /* synthetic */ void setMarkerMid(View view, String str) {
            super.setMarkerMid((VirtualView) view, str);
        }

        @Override // defpackage.wgc
        @snc(name = "markerStart")
        public /* bridge */ /* synthetic */ void setMarkerStart(View view, String str) {
            super.setMarkerStart((VirtualView) view, str);
        }

        @Override // defpackage.wgc
        @snc(name = "mask")
        public /* bridge */ /* synthetic */ void setMask(View view, String str) {
            super.setMask((VirtualView) view, str);
        }

        @Override // defpackage.wgc
        public /* bridge */ /* synthetic */ void setMatrix(View view, ReadableArray readableArray) {
            super.setMatrix((VirtualView) view, readableArray);
        }

        @Override // defpackage.wgc
        @snc(name = "name")
        public /* bridge */ /* synthetic */ void setName(View view, String str) {
            super.setName((VirtualView) view, str);
        }

        @Override // com.facebook.react.uimanager.BaseViewManager
        @snc(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f) {
            super.setOpacity((VirtualView) view, f);
        }

        @Override // defpackage.wgc
        @snc(name = "pointerEvents")
        public /* bridge */ /* synthetic */ void setPointerEvents(View view, String str) {
            super.setPointerEvents((VirtualView) view, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(name = "propList")
        public /* bridge */ /* synthetic */ void setPropList(View view, ReadableArray readableArray) {
            super.setPropList((RenderableView) view, readableArray);
        }

        @Override // defpackage.wgc
        @snc(name = "responsible")
        public /* bridge */ /* synthetic */ void setResponsible(View view, boolean z) {
            super.setResponsible((VirtualView) view, z);
        }

        @Override // defpackage.wgc
        @snc(name = "rotate")
        public /* bridge */ /* synthetic */ void setRotate(View view, Dynamic dynamic) {
            super.setRotate((u) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(name = "stroke")
        public /* bridge */ /* synthetic */ void setStroke(View view, Dynamic dynamic) {
            super.setStroke((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(name = "strokeDasharray")
        public /* bridge */ /* synthetic */ void setStrokeDasharray(View view, Dynamic dynamic) {
            super.setStrokeDasharray((RenderableView) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(name = "strokeDashoffset")
        public /* bridge */ /* synthetic */ void setStrokeDashoffset(View view, float f) {
            super.setStrokeDashoffset((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(defaultInt = 1, name = "strokeLinecap")
        public /* bridge */ /* synthetic */ void setStrokeLinecap(View view, int i) {
            super.setStrokeLinecap((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(defaultInt = 1, name = "strokeLinejoin")
        public /* bridge */ /* synthetic */ void setStrokeLinejoin(View view, int i) {
            super.setStrokeLinejoin((RenderableView) view, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(defaultFloat = 4.0f, name = "strokeMiterlimit")
        public /* bridge */ /* synthetic */ void setStrokeMiterlimit(View view, float f) {
            super.setStrokeMiterlimit((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(defaultFloat = 1.0f, name = "strokeOpacity")
        public /* bridge */ /* synthetic */ void setStrokeOpacity(View view, float f) {
            super.setStrokeOpacity((RenderableView) view, f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(name = "strokeWidth")
        public /* bridge */ /* synthetic */ void setStrokeWidth(View view, Dynamic dynamic) {
            super.setStrokeWidth((RenderableView) view, dynamic);
        }

        @Override // defpackage.wgc
        @snc(name = "textLength")
        public /* bridge */ /* synthetic */ void setTextLength(View view, Dynamic dynamic) {
            super.setTextLength((u) view, dynamic);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.wgc
        @snc(name = "vectorEffect")
        public /* bridge */ /* synthetic */ void setVectorEffect(View view, int i) {
            super.setVectorEffect((RenderableView) view, i);
        }

        @Override // defpackage.wgc
        @snc(name = "verticalAlign")
        public /* bridge */ /* synthetic */ void setVerticalAlign(View view, Dynamic dynamic) {
            super.setVerticalAlign((u) view, dynamic);
        }

        @Override // defpackage.wgc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((u) view, dynamic);
        }

        @Override // defpackage.wgc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((u) view, dynamic);
        }

        public TextViewManager(VirtualViewManager.SVGClass sVGClass) {
            super(sVGClass);
            ((VirtualViewManager) this).mDelegate = new zbc(this, 2);
        }
    }

    public static class FeFloodManager extends FilterPrimitiveManager<e> implements sfc<e> {
        public static final String REACT_CLASS = "RNSVGFeFlood";

        public FeFloodManager() {
            super(VirtualViewManager.SVGClass.RNSVGFeFlood);
            ((VirtualViewManager) this).mDelegate = new rfc(this);
        }

        @Override // com.horcrux.svg.RenderableViewManager.FilterPrimitiveManager, com.horcrux.svg.VirtualViewManager, com.facebook.react.uimanager.ViewGroupManager, defpackage.vo6
        public /* bridge */ /* synthetic */ void removeAllViews(View view) {
            super.removeAllViews(view);
        }

        @Override // defpackage.sfc
        @snc(name = "floodColor")
        public void setFloodColor(e eVar, Dynamic dynamic) {
            if (dynamic != null) {
                eVar.getClass();
                if (!dynamic.isNull()) {
                    if (dynamic.getType().equals(ReadableType.Map)) {
                        eVar.i(dynamic.asMap());
                        return;
                    }
                    ReadableType type = dynamic.getType();
                    int i = 0;
                    if (type.equals(ReadableType.Number)) {
                        eVar.c = JavaOnlyArray.of(0, Integer.valueOf(dynamic.asInt()));
                    } else if (type.equals(ReadableType.Array)) {
                        eVar.c = dynamic.asArray();
                    } else {
                        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                        javaOnlyArray.pushInt(0);
                        Matcher matcher = e.e.matcher(dynamic.asString());
                        while (matcher.find()) {
                            double d = Double.parseDouble(matcher.group());
                            int i2 = i + 1;
                            if (i < 3) {
                                d /= 255.0d;
                            }
                            javaOnlyArray.pushDouble(d);
                            i = i2;
                        }
                        eVar.c = javaOnlyArray;
                    }
                    eVar.invalidate();
                    return;
                }
            }
            eVar.c = null;
            eVar.invalidate();
        }

        @Override // defpackage.sfc
        @snc(defaultFloat = 1.0f, name = "floodOpacity")
        public void setFloodOpacity(e eVar, float f) {
            eVar.d = f;
            eVar.invalidate();
        }

        @Override // defpackage.sfc
        @snc(name = "height")
        public /* bridge */ /* synthetic */ void setHeight(View view, Dynamic dynamic) {
            super.setHeight((ob5) view, dynamic);
        }

        @Override // defpackage.sfc
        @snc(name = "result")
        public /* bridge */ /* synthetic */ void setResult(View view, String str) {
            super.setResult((ob5) view, str);
        }

        @Override // defpackage.sfc
        @snc(name = "width")
        public /* bridge */ /* synthetic */ void setWidth(View view, Dynamic dynamic) {
            super.setWidth((ob5) view, dynamic);
        }

        @Override // defpackage.sfc
        @snc(name = "x")
        public /* bridge */ /* synthetic */ void setX(View view, Dynamic dynamic) {
            super.setX((ob5) view, dynamic);
        }

        @Override // defpackage.sfc
        @snc(name = "y")
        public /* bridge */ /* synthetic */ void setY(View view, Dynamic dynamic) {
            super.setY((ob5) view, dynamic);
        }

        public void setFloodColor(e eVar, ReadableMap readableMap) {
            eVar.i(readableMap);
        }
    }
}
