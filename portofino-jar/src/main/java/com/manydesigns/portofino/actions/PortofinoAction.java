/*
 * Copyright (C) 2005-2011 ManyDesigns srl.  All rights reserved.
 * http://www.manydesigns.com/
 *
 * Unless you have purchased a commercial license agreement from ManyDesigns srl,
 * the following license terms apply:
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * There are special exceptions to the terms and conditions of the GPL
 * as it is applied to this software. View the full text of the
 * exception in file OPEN-SOURCE-LICENSE.txt in the directory of this
 * software distribution.
 *
 * This program is distributed WITHOUT ANY WARRANTY; and without the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see http://www.gnu.org/licenses/gpl.txt
 * or write to:
 * Free Software Foundation, Inc.,
 * 59 Temple Place - Suite 330,
 * Boston, MA  02111-1307  USA
 *
 */

package com.manydesigns.portofino.actions;

/*
* @author Paolo Predonzani     - paolo.predonzani@manydesigns.com
* @author Angelo Lupo          - angelo.lupo@manydesigns.com
* @author Giampiero Granatella - giampiero.granatella@manydesigns.com
* @author Alessio Stalla       - alessio.stalla@manydesigns.com
*/
public class PortofinoAction {
    public static final String copyright =
            "Copyright (c) 2005-2011, ManyDesigns srl";

    //**************************************************************************
    // Constants
    //**************************************************************************

    public final static String DEFAULT_SKIN = "default";

    //**************************************************************************
    // Common action results
    //**************************************************************************

    public final static String UNAUTHORIZED = "unauthorized";
    public final static String STATUS_400 = "400";
    public final static String STATUS_403 = "403";
    public final static String STATUS_404 = "404";
    public final static String STATUS_500 = "500";

    public final static String CANCEL = "cancel";
    public final static String SEARCH = "search";
    public final static String LIST = "list";
    public final static String RETURN_TO_SEARCH = "returnToSearch";
    public final static String RETURN_TO_LIST = "returnToList";
    public final static String RETURN_TO_READ = "returnToRead";
    public final static String READ = "read";
    public final static String CREATE = "create";
    public final static String SAVE = "save";
    public final static String EDIT = "edit";
    public final static String UPDATE = "update";
    public final static String BULK_EDIT = "bulkEdit";
    public final static String BULK_UPDATE = "bulkUpdate";
    public final static String DELETE = "delete";
    public final static String SUMMARY = "summary";
    public final static String CHART = "chart";
    public final static String EXPORT = "export";
    public final static String REDIRECT_TO_FIRST = "redirectToFirst";
    public final static String NO_CLASSES = "noClasses";
    public final static String JSON_SELECT_FIELD_OPTIONS = "jsonSelectFieldOptions";
    public final static String INDEX = "index";
    
}