import com.branegy.tools.api.ToolService;
import com.branegy.tools.model.ToolHistory;

List<ToolHistory> list = dbm.getService(ToolService.class).pruneToolHistory(p_tool_id,(int)p_up_to_date);
println """<table class="simple-table" cellspacing="0" cellpadding="10">
           <thead>
           <tr style="background-color:#EEE">
             <th>Id</th>
             <th>Tool Name</th>
             <th>Start</th>
             <th>Status</th>
           </tr></thead><tbody>"""
list.each{ 
    println "<tr style=\"vertical-align: top;\">"
    println """<td style=\"padding:5px\">${it.getId()}</td>"""
    println """<td style=\"padding:5px\">${it.getToolName()}</td>"""
    println """<td style=\"padding:5px\">${it.getStart()}</td>"""
    println """<td style=\"padding:5px\">${it.getStatus()}</td>"""
    println "</tr>"
}
println "</tbody></table>"
