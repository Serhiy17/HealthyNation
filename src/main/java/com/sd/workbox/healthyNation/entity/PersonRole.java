/* UserRole 1.0 10/04/2017 */
package com.sd.workbox.healthyNation.entity;

/**
 * An enumeration of Person roles.
 *
 * @version 1.0 10 April 2017
 *
 * @author Serhiy Dudynsky
 *
 * @since 1.8
 */
public enum PersonRole {

    /**
     * User role values.
     */
    ROLE_USER("simpleUser"), ROLE_ADMIN("admin");

    /**
     * User role message code for localization purposes.
     */
    private String role;

    /**
     * User group level constructor.
     *
     * @param role
     *            user role
     */
    PersonRole(final String role) {
        this.role = role;
    }

    /**
     * Message code getter.
     *
     * @return message code
     */
    public String getRole() {
        return role;
    }
}
