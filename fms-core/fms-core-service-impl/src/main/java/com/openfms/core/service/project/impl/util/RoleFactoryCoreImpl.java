package com.openfms.core.service.project.impl.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.openfms.model.utils.RoleFactory;

@Component
public class RoleFactoryCoreImpl implements RoleFactory {

	public enum CORE_ROLES {
		ROLE_PROJECT_ADMIN,

		ROLE_READ_SCHEDULE, ROLE_READ_MOVIES_AND_VERSIONS, ROLE_READ_MOVIE_MEDIA_CLIPS, ROLE_READ_FILES_AND_PACKAGES, ROLE_READ_FILE_AND_PACKAGE_COPIES, ROLE_READ_SITES_LOCATIONS_DEVICES, ROLE_READ_STATUS, ROLE_READ_TASKS, ROLE_READ_KEYS, ROLE_READ_KEY_DATA, ROLE_READ_CERTIFICATES, ROLE_READ_PROJECT_MACHINE_STATUS, ROLE_READ_HISTORY, ROLE_READ_PROGRAM,

		ROLE_EDIT_SCHEDULE, ROLE_EDIT_MOVIES, ROLE_EDIT_VERSIONS, ROLE_EDIT_MOVIE_MEDIA_CLIPS, ROLE_EDIT_FILES_AND_PACKAGES, ROLE_EDIT_FILE_AND_PACKAGE_COPIES, ROLE_EDIT_SITES_LOCATIONS_DEVICES, ROLE_EDIT_STATUS, ROLE_EDIT_TASKS, ROLE_EDIT_TASK_PROGRESS, ROLE_EDIT_CERTIFICATES, ROLE_EDIT_KEYS, ROLE_EDIT_KEY_DATA, ROLE_EDIT_PROJECT_MACHINE_STATUS

	}

	@Override
	public List<String> listRoles() {
		List<String> out = new ArrayList<String>();
		for (CORE_ROLES rc : CORE_ROLES.values()) {
			out.add(rc.name());
		}
		return out;
	}

}
