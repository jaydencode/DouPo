package mmo.module.gm.gui.provider.table.tags;

import mmo.module.gm.bean.ExchangeTag;

import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.swt.graphics.Image;

public class TableTagsLableProvider implements ITableLabelProvider {
	public static final int ID   = 0;
	public static final int TAG  = 1;
	public static final int NOTE = 2;

	@Override
	public Image getColumnImage(Object arg0, int arg1) {
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		ExchangeTag game = (ExchangeTag) element;
		switch (columnIndex) {
			case ID: {
				return game.getId() + "";
			}
			case TAG: {
				return game.getTag();
			}
			case NOTE: {
				return game.getNote();
			}
			default: {
				return "";
			}
		}
	}

	@Override
	public void addListener(ILabelProviderListener arg0) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public boolean isLabelProperty(Object arg0, String arg1) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener arg0) {

	}

}