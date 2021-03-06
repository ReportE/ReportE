package com.savvis.spirits.report.web.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.commons.lang3.ArrayUtils;

/**
 * All utility methods to be consumed by web tier should implement here.
 * <p>
 * @author HtetAung.Hein
 *
 */
public class WebUtils {
	public static void addErrorMessage(String summary, Object... args) {
		if (ArrayUtils.isNotEmpty(args)) {
			summary = String.format(summary, args);
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, summary, summary));
	}
	
	public static void addInfoMessage(String summary, Object... args) {
		if (ArrayUtils.isNotEmpty(args)) {
			summary = String.format(summary, args);
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null));
	}
	
	public static void addWarningMessage(String summary, Object... args) {
		if (ArrayUtils.isNotEmpty(args)) {
			summary = String.format(summary, args);
		}
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, summary, null));
	}
}
